package Programmers;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

public class TradeProgram {

    // 결과를 저장할 파일 경로입니다.
    private static final String OUTPUT_FILE = "/Users/Kang/uploads/temp/TradeProgram_Result.txt";

    public static void main(String[] args) {
        long startTime = System.nanoTime(); //처리 시작 시간 측정
        String filePath = "/Users/Kang/uploads/temp/Hoa_data.doc"; //입력 파일 경로

        try {
            // 거래 데이터 파일을 읽어서 처리합니다.
            Map<String, ConcurrentHashMap<String, long[]>> aggregatedData = processTradeData(filePath);
            // 처리 결과를 파일에 저장합니다.
            writeAggregatedDataToFile(aggregatedData, OUTPUT_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime(); //처리 종료 시간 측정
        System.out.println("실행 시간(초): " + (double) (endTime - startTime) / 1_000_000_000.0);
    }

    // 거래 데이터 파일을 읽어서 처리합니다.
    private static Map<String, ConcurrentHashMap<String, long[]>> processTradeData(String filePath) throws IOException {
        Map<String, ConcurrentHashMap<String, long[]>> aggregatedData = new ConcurrentHashMap<>();

        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
            stream.parallel() // 병렬 처리 활성화
                    .forEach(line -> {
                        String preciseTime = extractTime(line, 0, 15); //시간 추출
                        String stockCode = extractStockCode(line, 15, 21); //종목코드 추출
                        long price = extractPrice(line, 26, 35); //가격 추출
//                        System.out.printf("%s %s %,d\n", preciseTime, stockCode, price); //추출한 데이터 출력
                        String halfHour = getHalfHour(preciseTime); // 30분 단위 시간대 계산
                        // ConcurrentHashMap을 사용하여 병렬 처리에서 안전하게 데이터 처리
                        aggregatedData.computeIfAbsent(stockCode, k -> new ConcurrentHashMap<>())
                                .compute(halfHour, (k, v) -> updatePrices(v, price, preciseTime));
                    });
        }

        return aggregatedData;
    }

    //substring보단 인덱스 직접 접근을 통해 추출
    private static String extractStockCode(String line, int start, int end) {
        StringBuilder stockCodeBuilder = new StringBuilder();
        for (int i = start; i < end; i++) {
            char c = line.charAt(i);
            if (c >= '0' && c <= '9') {
                stockCodeBuilder.append(c);
            }
        }
        return stockCodeBuilder.toString();
    }


    private static String extractTime(String line, int start, int end) {
        StringBuilder timeBuilder = new StringBuilder();
        for (int i = start; i < end; i++) {
            char c = line.charAt(i);
            if ((c >= '0' && c <= '9') || c == ':') {
                timeBuilder.append(c);
            }
        }
        return timeBuilder.toString();
    }


    private static long extractPrice(String line, int start, int end) {
        long price = 0;
        for (int i = start; i < end; i++) {
            char c = line.charAt(i);
            if (c >= '0' && c <= '9') {
                price = price * 10 + (c - '0');
            }
        }
        return price;
    }

    // 가격 정보를 업데이트합니다
    private static long[] updatePrices(long[] pricesAndTime, long price, String time) {
        if (pricesAndTime == null) {
            // prices 배열이 null 인 경우 새로운 가격 정보로 초기화
            pricesAndTime = new long[]{price, price, price, price, Long.parseLong(time.replaceAll(":", ""))};
        }else {
            long currentTime = Long.parseLong(time.replaceAll(":", ""));
            if (currentTime < pricesAndTime[4]) { // 최초 가격 업데이트
                pricesAndTime[0] = price;
            }
            pricesAndTime[1] = Math.max(pricesAndTime[1], price); // 최고가
            pricesAndTime[2] = (pricesAndTime[2] == 0 ? price : Math.min(pricesAndTime[2], price)); // 최저가
            if(currentTime >= pricesAndTime[4]) { // 최종 가격 업데이트
                pricesAndTime[3] = price;
                pricesAndTime[4] = currentTime;
            }
        }
        return pricesAndTime;
    }


    // 정밀한 시간 정보를 받아 30분 간격의 시간대로 변환합니다
    private static String getHalfHour(String preciseTime) {
        String[] parts = preciseTime.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        // 30분 간격으로 시간대를 조정합니다.
        if (minute < 30) {
            return String.format("%02d:00", hour); // 분이 30분보다 작으면 00분으로 조정
        } else {
            return String.format("%02d:30", hour); // 분이 30분보다 크면 30분으로 조정
        }
    }


    // 처리 결과를 파일에 저장합니다.
    private static void writeAggregatedDataToFile(Map<String, ConcurrentHashMap<String, long[]>> aggregatedData, String outputFile) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile), 8192 * 8)) {
            for (String stockCode : new TreeSet<>(aggregatedData.keySet())) {
                writer.write(String.format("%-12s %-8s %-7s %-8s %-8s\n", stockCode, "최초가", "최고가", "최저가", "최종가"));

                // 시간대별로 데이터를 출력합니다.
                for (String timeSlot : generateHalfHour()) {
                    long[] prices = aggregatedData.get(stockCode).getOrDefault(timeSlot, new long[]{0, 0, 0, 0});
                    String formattedPrices = PricesFormat(prices);
                    writer.write(String.format("%s  %s\n", timeSlot, formattedPrices));
                }
                writer.newLine();
            }
        }
    }

    // 가격 배열을 문자열로 변환합니다
    private static String PricesFormat(long[] prices) {
        // 가격 데이터가 없거나 모든 가격이 0인 경우
        if (prices == null || (prices[0] == 0 && prices[1] == 0 && prices[2] == 0 && prices[3] == 0)) {
            return String.format("%10s %9s %9s %9s", "0", "0", "0", "0");
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < prices.length - 1; i++) { // 마지막 시간 정보를 제외하고 반복
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
