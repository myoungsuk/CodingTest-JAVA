package Programmers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

class RandomDataGenerator {
    private static final String FILE_PATH = "/Users/Kang/uploads/temp/sample_data2.doc";
    private static final int NUMBER_OF_LINES = 10000000; // 생성할 라인 수
    private static final Random random = new Random();

    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (int i = 0; i < NUMBER_OF_LINES; i++) {
                String line = generateRandomLine();
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("생성 완료");
    }

    private static String generateRandomLine() {
        // 13:00부터 15:00까지의 랜덤 시간을 생성합니다.
        LocalTime randomTime = LocalTime.of(13, 0).plusMinutes(random.nextInt(120)); // 120분 범위
        String time = randomTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        String firstGroup = randomNumericString(11);
        String secondGroup = randomNumericString(7);
        String thirdGroup = randomNumericString(6);
        String fourthGroup = randomNumericString(14);
        return time + "-" + firstGroup + secondGroup + thirdGroup + fourthGroup;
    }

    private static String randomNumericString(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(random.nextInt(10)); // 0 to 9
        }
        return sb.toString();
    }


}
