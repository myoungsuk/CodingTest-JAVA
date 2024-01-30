package Programmers;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TradeProgram {

    // 결과를 저장할 파일 경로입니다.
    private static final String OUTPUT_FILE = "/Users/Kang/uploads/temp/result.txt";
    private static final long[] DEFAULT_PRICES = new long[]{0, 0, 0, 0}; // 가격 정보가 없는 경우 기본값
    private static final int LINES_PER_THREAD = 8831; // 각 스레드가 처리할 라인 수


    public static void main(String[] args) {
        // 출력 시간 계산
        long startTime = System.nanoTime(); // 측정 시작 시간
        String filePath = "/Users/Kang/uploads/temp/Hoa_data.doc"; //입력 파일 경로

        try {
            // 거래 데이터 파일을 읽어서 처리합니다.
            Map<String, ConcurrentHashMap<String, long[]>> aggregatedData = processTradeData(filePath);
            // 처리 결과를 파일에 저장합니다.
            writeAggregatedDataToFile(aggregatedData);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 출력 시간 계산
        long endTime = System.nanoTime();
        System.out.println("실행 시간: " + (endTime - startTime) / 1000000000.0 + "초");

    }

    // 거래 데이터 파일을 읽어서 처리합니다.
    private static Map<String, ConcurrentHashMap<String, long[]>> processTradeData(String filePath) throws IOException, InterruptedException {
        Map<String, ConcurrentHashMap<String, long[]>> aggregatedData = new ConcurrentHashMap<>();
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        int totalLines = lines.size();
        System.out.println("lines_per_thread = " + LINES_PER_THREAD); // 쓰레드당 처리하는 라인수
        System.out.println("totalLines = " + totalLines); // 데이터 전체 라인수

        int numberOfThreads = (int) Math.ceil(totalLines / (double) LINES_PER_THREAD);
        System.out.println("numberOfThreads = " + numberOfThreads); // 쓰레드 개수

        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);

        for (int i = 0; i < numberOfThreads; i++) {
            int start = i * LINES_PER_THREAD;
            int end = Math.min((i + 1) * LINES_PER_THREAD, totalLines);
            List<String> subList = lines.subList(start, end);
            executor.submit(() -> processLines(subList, aggregatedData));
        }


        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.HOURS);

        return aggregatedData;
    }

    // 각 라인을 처리합니다.
    private static void processLines(List<String> lines, Map<String, ConcurrentHashMap<String, long[]>> aggregatedData) {
        for (String line : lines) {
            String preciseTime = extractTime(line);
            String stockCode = extractStockCode(line);
            long price = extractPrice(line);

            String halfHour = getHalfHour(preciseTime);
            aggregatedData.computeIfAbsent(stockCode, k -> new ConcurrentHashMap<>())
                    .compute(halfHour, (k, v) -> updatePrices(v, price, preciseTime));
        }
    }

    //성능 향상을 위해 substring보단 인덱스 직접 접근을 통해 추출
    private static String extractStockCode(String line) {
        StringBuilder stockCode = new StringBuilder();
        for (int i = 15; i < 21; i++) {
            char c = line.charAt(i);
            stockCode.append(c);
        }
        return stockCode.toString();
    }
    private static String extractTime(String line) {
        StringBuilder time = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            char c = line.charAt(i);
            if ((c >= '0' && c <= '9') || c == ':') {
                time.append(c);
            }
        }

        return time.toString();
    }
    private static long extractPrice(String line) {
        long price = 0;
        for (int i = 26; i < 35; i++) {
            char c = line.charAt(i);
            if (c >= '0' && c <= '9') {
                price = price * 10 + (c - '0');
            }
        }
        return price;
    }

    // 가격 정보를 업데이트합니다
    private static long[] updatePrices(long[] pricesAndTime, long price, String time) {
        long currentTime = Long.parseLong(time.replaceAll(":", ""));

        if (pricesAndTime == null) {
            // prices 배열이 null 인 경우 새로운 가격 정보로 초기화
            pricesAndTime = new long[]{price, price, price, price, currentTime, currentTime};
        } else {
            if (currentTime < pricesAndTime[4]) { // 최초 가격 업데이트
                pricesAndTime[0] = price;
                pricesAndTime[4] = currentTime; // 가장 최근 가격 시간 업데이트
            }
            pricesAndTime[1] = Math.max(pricesAndTime[1], price); // 최고가
            pricesAndTime[2] = (pricesAndTime[2] == 0 ? price : Math.min(pricesAndTime[2], price)); // 최저가
            if (currentTime >= pricesAndTime[5]) { // 최종 가격 업데이트
                pricesAndTime[3] = price;
                pricesAndTime[5] = currentTime; // 가장 최종 가격 시간 업데이트
            }
        }
        return pricesAndTime;
    }



    // 정밀한 시간 정보를 받아 30분 간격의 시간대로 변환합니다
    private static String getHalfHour(String preciseTime) {
        int hour = (preciseTime.charAt(0) - '0') * 10 + (preciseTime.charAt(1) - '0');
        int minute = (preciseTime.charAt(3) - '0') * 10 + (preciseTime.charAt(4) - '0');

        // 30분 간격으로 시간대를 조정합니다.
        if (minute < 30) {
            return (hour < 10 ? "0" : "") + hour + ":00"; // 분이 30분보다 작으면 00분으로 조정
        } else {
            return (hour < 10 ? "0" : "") + hour + ":30"; // 분이 30분보다 크면 30분으로 조정
        }
    }



    private static void writeAggregatedDataToFile(Map<String, ConcurrentHashMap<String, long[]>> aggregatedData) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(TradeProgram.OUTPUT_FILE), 8192 * 8)) {
            for (String stockCode : new TreeSet<>(aggregatedData.keySet())) {
                ConcurrentHashMap<String, long[]> data = aggregatedData.get(stockCode);
                writeDataForStockCode(writer, stockCode, data); // 수정된 메소드 호출
            }
        }
    }

    private static void writeDataForStockCode(BufferedWriter writer, String stockCode, ConcurrentHashMap<String, long[]> data) throws IOException {
        writer.write(String.format("%-12s %-8s %-7s %-8s %-8s\n", stockCode, "최초가", "최고가", "최저가", "최종가"));

        for (String timeSlot : generateHalfHour()) {
            long[] prices = data.getOrDefault(timeSlot, DEFAULT_PRICES);
            String formattedPrices = PricesFormat(prices);
            writer.write(String.format("%s  %s\n", timeSlot, formattedPrices));
        }
        writer.newLine();
    }



    // 가격 배열을 문자열로 변환합니다
    private static String PricesFormat(long[] prices) {
        // 가격 데이터가 없거나 모든 가격이 0인 경우
        if (prices == null || Arrays.equals(prices, DEFAULT_PRICES)) {
            return String.format("%10s %9s %9s %9s", "0", "0", "0", "0");
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < prices.length - 2; i++) { // 마지막 시간 정보를 제외하고 반복
            sb.append(String.format("%10s", String.format("%,d", prices[i])));
        }
        return sb.toString();
    }



    // '12:30'부터 '14:30'까지의 반시간 간격의 리스트를 생성하는 메서드입니다.
    private static List<String> generateHalfHour() {
        List<String> item = new ArrayList<>();
        item.add("12:30");
        for (int hour = 13; hour <= 14; hour++) {
            // 12시 정각을 제외하고 12:30부터 시작합니다.
            for (int minute : new int[]{0, 30}) {
                item.add(String.format("%02d:%02d", hour, minute));
            }
        }
        return item;
    }



}
