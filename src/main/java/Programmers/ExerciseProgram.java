package Programmers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.ConcurrentHashMap;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class ExerciseProgram {

    //출력 할 파일 경로 정하기
    private static final String OUTPUT_FILE = "/Users/Kang/uploads/temp/result.txt";
    //가격 정보가 없는 경우 넣어줄 값
    private static final long[] DEFAULT_PRICES = new long[]{0, 0, 0, 0};
    // 각 스레드가 처리할 라인 수
    private static final int LINES_PER_THREAD = 8831;

    public static void main(String[] args){
        String filePath = "/Users/Kang/uploads/temp/Hoa_data.doc"; //입력 파일 경로

        try{
            Map<String, ConcurrentHashMap<String, long[]>> aggregatedData = processTradeData(filePath); //입력 파일 받아 처리하기
            writeAggregatedDataToFile(aggregatedData); //처리한 거 출력하기
        }catch (IOException e) {
            e.printStackTrace();
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    //파일 처리하는 메서드
    private static Map<String,ConcurrentHashMap<String,long[]>> processTradeData(String filePath) throws InterruptedException, IOException {
        /*
        모든 작업은 스레드 안전하게 설계되어 있어 여러 스레드가 동시에 맵을 수정하더라도 데이터 무결성을 유지
        내부적으로 여러 세그먼트로 데이터를 분할해 여러 스레드가 맵의 다른 부분에 동시에 접근하고 수정할 수 있다.
        전체 맵을 락하는 대신 내부적으로 락 분할 기법을 사용하여 특정 세그먼트에 대해서만 락을 걸어 동시성 향상
        읽기 연산을 수행할때 락을 사용하지 않아 읽기와 쓰기 연산이 서로 차단하지 않도록 함
        null 값 비허용
         */
        Map<String, ConcurrentHashMap<String, long[]>> aggregatedData = new ConcurrentHashMap<>(); //키값을 주가코드로 잡은 맵 병렬처리의 안정성을 위해 ConcurrentHashMap 이용
        List<String> lines = Files.readAllLines(Paths.get(filePath)); //모든 라인 읽기
        int totalLines = lines.size(); //모든 라인 길이 구하기
        int numberOfThreads = (int) Math.ceil(totalLines/(double) LINES_PER_THREAD); //스레드 개수 설정

        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads); //ExecutorService를 사용한 고정된 스레드 개수 생성

        for(int i = 0; i < numberOfThreads; i++){ //스레드 개수만큼 반복
            int start = i * LINES_PER_THREAD; //현재 스레드가 처리할 줄의 범위 시작
            int end = Math.min((i + 1) * LINES_PER_THREAD, totalLines); //현재 스레드가 처리할 줄의 범위 끝
            List<String> subList = lines.subList(start, end); //스레드가 처리할 부분 리스트를 생성
            executor.submit(() -> processLines(subList, aggregatedData)); //각 스레드에 작업을 할당
        }
        executor.shutdown(); //스레드 종료
        executor.awaitTermination(1, TimeUnit.HOURS); //스레드가 멈췄을때 끝내는시간 1시간으로 설정

        return aggregatedData;
    }

    //스레드에 처리받은 라인들 세부처리 메서드
    private static void processLines(List<String> lines, Map<String, ConcurrentHashMap<String, long[]>> aggregatedData){
        for(String line : lines){
            String preciseTime = extractTime(line); // 한 줄의 시간 추출
            String stockCode = extractStockCode(line); //한 줄의 종목코드 추출
            long price = extractPrice(line); //한 줄의 종목 가격 추출

            String halfHour = getHalfHour(preciseTime); // 시간단위를 30분씩으로 출력하기 위한 선언
            aggregatedData.computeIfAbsent(stockCode, k -> new ConcurrentHashMap<>()) //stockCode에 해당하는 CurrentHashMap을 찾는데 없으면 새로운 ConcurrentHashMap 생성
                    .compute(halfHour, (k, v) -> updatePrices(v, price, preciseTime)); // halfHour에 해당하는 long[]배열을 찾는다  배열이 없으면 updatePrices메서드로 전달
        }
    }

    private static String extractStockCode(String line) { //주석 인덱스 출력
        StringBuilder stockCode = new StringBuilder();
        for(int i = 15; i < 21; i++){
            char c = line.charAt(i);
            stockCode.append(c);
        }
        return stockCode.toString();
    }
    private static String extractTime(String line){ //시간 인덱스 출력 '-'를 제외하고 받아옴
        StringBuilder time = new StringBuilder();
        for(int i = 0; i < 15; i++){
            char c = line.charAt(i);
            if(( c >= '0' && c <= '9') || c == ':'){
                time.append(c);
            }
        }
        return time.toString();
    }
    private static long extractPrice(String line) { //가격값을 long으로 바꿔 온다
        long price = 0;
        for(int i = 26; i < 35; i++){
            char c = line.charAt(i);
            if(c >= '0' && c <= '9') {
                price = price * 10 + (qc - '0');
            }
        }
        return price;
    }

    //가격 업데이트
    private static long[] updatePrices(long[] pricesAndTime, long price, String time) {
        long currentTime = Long.parseLong(time.replaceAll(":", "")); //입력된 시간문자열에서 콜론을 제거하고 숫자로 변환

        if(pricesAndTime == null) {
            pricesAndTime = new long[]{price, price, price, price, currentTime, currentTime};
        }else {
            // 최초 가격 설정: 최초 거래 시간이 아직 설정되지 않았을 때만
            if(pricesAndTime[4] == 0) {
                pricesAndTime[0] = price;
                pricesAndTime[4] = currentTime;
            }
            pricesAndTime[1] = Math.max(pricesAndTime[1], price);
            pricesAndTime[2] = (pricesAndTime[2] == 0 ? price : Math.min(pricesAndTime[2], price));
            if(currentTime >= pricesAndTime[5]) {
                pricesAndTime[3]= price;
                pricesAndTime[5] = currentTime;
            }
        }
        return pricesAndTime;
    }

    private static String getHalfHour(String preciseTime) {
        int hour = (preciseTime.charAt(0) - '0') * 10 + (preciseTime.charAt(1) - '0'); //시간 값 가져오기
        int minute = (preciseTime.charAt(3) - '0') * 10 + (preciseTime.charAt(4) - '0'); //분값 가져오기

        if(minute < 30) { //분이 삼십분아래인지 위인지 확인
            return (hour < 10 ? "0" : "") + hour + ":00"; // 분이 30분보다 작으면 00 분으로 조정
        } else {
            return (hour < 10 ? "0" : "") + hour + "30"; //분이 30분보다 높으면 30분으로 조정
        }
    }


    private static void writeAggregatedDataToFile(Map<String, ConcurrentHashMap<String, long[]>> aggregatedData) throws IOException {
        /*
        버퍼의 사이즈를 지정하는건 파일 쓰기 작업의 효율성을 높이기 위한 방법이다.
        여기선 64kb로 설정했다.
        버퍼 사이즈를 크게 설정하면 I/O작업에 최소화를 시킬 수 있다.
        버퍼를 사용하면 실제 파일에 쓰기 전에 데이터를 메모리 상의 버퍼에 모은다. 그래서 버퍼가 가득 차면 한 번에 파일에 쓰기 작업을 수행하는데
        이렇게 하면 빈번한 파일 쓰기 호출을 줄여 성능을 향상시킬 수 있다.
        하지만 너무 크게 설절하면 사용 가능한 메모리에 영향을 줄 수 있다.
         */
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ExerciseProgram.OUTPUT_FILE), 8192 * 8)) {
            for(String stockCode : new TreeSet<>(aggregatedData.keySet())) { //treeSet을 이용해 주식코드 순서대로 나열
                ConcurrentHashMap<String, long[]> data = aggregatedData.get(stockCode);
                writeDataForStockCode(writer, stockCode, data); //파일 출력
            }
        }
    }

    private static void writeDataForStockCode(BufferedWriter writer, String stockCode, ConcurrentHashMap<String, long[]> data) throws IOException {
        writer.write(String.format("%-12s %-8s %-7s %-8s %-8s\n", stockCode, "최초가", "최고가", "최저가", "최종가"));

        for(String timeSlot : generateHalfHour()) {
            long[] prices = data.getOrDefault(timeSlot, DEFAULT_PRICES);
            String formattedPrices = PricesFormat(prices);
            writer.write(String.format("%s  %s\n", timeSlot, formattedPrices));
        }
        writer.newLine();
    }

    //가격 출력 포맷
    private static String PricesFormat(long[] prices){
        /*
        자주쓰는 정보들ㅇ
         */
        if(prices == null || Arrays.equals(prices, DEFAULT_PRICES)) { //해당 시간대의 정보가 없으면 기본 가격정보로 사용
            return String.format("%10s %9s %9s %9s", "0", "0", "0", "0");
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < prices.length - 2; i++){
            sb.append(String.format("%10s", String.format("%,d", prices[i])));
        }
        return sb.toString();
    }

    //시간 출력 포맷
    private static List<String> generateHalfHour() {
        List<String> item = new ArrayList<>();
        item.add("12:30");
        for(int hour = 13; hour <= 14; hour++) {
            for(int minute : new int[]{0, 30}) {
                item.add(String.format("%02d:%02d", hour, minute));
            }
        }
        return item;
    }


}