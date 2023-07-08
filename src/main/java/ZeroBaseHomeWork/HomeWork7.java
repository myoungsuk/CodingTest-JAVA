package ZeroBaseHomeWork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        /*
        강명석
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("[로또 당첨 프로그램]\n");
        System.out.print("로또 개수를 입력해 주세요.(숫자1~10):");
        int count = sc.nextInt();

        int[][] lottoarr = new int[count][6];
        Random random = new Random();
        int intValue = 0;

        for (int i = 0; i < count; i++) {
            intValue = i + 65;
            System.out.print((char) intValue + "   "); //개수 번호 출력

            for (int j = 0; j < 6; j++) { // 로또 출력
                lottoarr[i][j] = random.nextInt(45) + 1;
            }
            Arrays.sort(lottoarr[i]);

            for (int j = 0; j < 6; j++) {
                System.out.printf("%02d", lottoarr[i][j]);
                if (j < 5) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("[로또 발표]");
        int[] lottoanswer = new int[6];
        for (int i = 0; i < 6; i++) {
            lottoanswer[i] = random.nextInt(45) + 1;
        }
        Arrays.sort(lottoanswer);
        System.out.print("    ");
        for(int i = 0; i < 6; i++){
            System.out.printf("%02d", lottoanswer[i]);
            if (i < 5) {
                System.out.print(",");
            }
        }
        System.out.println();


        System.out.println();
        System.out.println("[내 로또 결과]");
        int[] samecount = new int[count];
        for(int i = 0; i < count; i++){
            int intValue2 = 65 + i;
            System.out.print((char) intValue2 + "   ");

            for (int j = 0; j < 6; j++) {
                System.out.printf("%02d", lottoarr[i][j]);
                if (j < 5) {
                    System.out.print(",");
                }
                if(lottoanswer[j] == lottoarr[i][j]){
                    samecount[i]++;
                }
            }

            System.out.println("  => " + samecount[i] + "개 일치");
        }
    }
}
