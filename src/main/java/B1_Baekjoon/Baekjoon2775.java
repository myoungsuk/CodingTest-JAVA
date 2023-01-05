package B1_Baekjoon;

import java.util.Scanner;

public class Baekjoon2775 {
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        int[][] APT = new int[15][15];

        for(int i = 0; i < 15; i++){
            APT[i][1] = 1;
            APT[0][i] = i;
        }

        for(int i = 1; i < 15; i++){

            for(int j = 1; j < 15; j++){
                APT[i][j] = APT[i][j-1] + APT[i-1][j];
            }
        }

        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int K = sc.nextInt();
            int N = sc.nextInt();
            System.out.println(APT[K][N]);
        }

    }
}
