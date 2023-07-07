package ZeroBaseHomeWork;

import java.util.Random;
import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        /*
        강명석
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("총 진행할 투표수를 입력해 주세요.");
        int count = sc.nextInt();
        System.out.print("가상 선거를 진행할 후보자 인원을 선택해 주세요.");
        int personCount = sc.nextInt();
        String[] personlist = new String[personCount];
        for (int i = 0; i < personlist.length; i++) {
            System.out.print((i + 1) + "번째 후보자이름을 입력해 주세요.");
            personlist[i] = sc.next();

        }

        Random random = new Random();

        int[] personVote = new int[personCount];
        double[] personVoteRate = new double[personCount];
//        for (int i = 0; i < personCount; i++) {
//            personVote[i] = 0;  //인원별 투표수 0으로 초기 선언
//        }



        for (int i = 0; i < count; i++) {
            double progress = (double) (i + 1) / count; //투표율
            int choosePerson = random.nextInt(personCount); //랜덤 투표 진행
            String formatProgress = String.format("%.2f%%", progress * 100); //투표율 포맷

            System.out.println("[투표진행률]:" + formatProgress + ", " + (i + 1) + "명 투표 => " + personlist[choosePerson]);

            personVote[choosePerson]++;

            for (int j = 0; j < personCount; j++) {
                double[] votePercentage = new double[personCount]; // 투표율 선언
                votePercentage[j] = (double) personVote[j] /count * 100; //투표율 계산
                System.out.printf("[기호:%s] %s: %.2f%% (투표수: %d)\n", j + 1, personlist[j], votePercentage[j], personVote[j]);
            }

        }

        int maxIndex = getMaxIndex(personVote);
        System.out.println("[투표결과] 당선인 : " + personlist[maxIndex]);
    }

    public static int getMaxIndex(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("배열이 비어있습니다");
        }

        int maxIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[maxIndex]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }

}
