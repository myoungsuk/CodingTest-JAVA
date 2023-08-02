package S1_Baekjoon;

import java.util.*;

public class Baekjoon1890 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] NN = new int[N][N];
        long[][] dp = new long[N][N]; //경로의 수가 매우 클 수 있으므로 long 타입

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                NN[i][j] = sc.nextInt();
            }
        }

        dp[0][0] = 1; //시작접의 경로 수는 1

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(NN[i][j] == 0){
                    continue; //도착점은 패스
                }
                if(j + NN[i][j] < N){ //오른쪽으로 이동할 경우
                    dp[i][j + NN[i][j]] += dp[i][j];
                }
                if(i + NN[i][j] < N){ //아래쪽으로 이동할 경우
                    dp[i +  NN[i][j]][j] += dp[i][j];
                }
            }
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                System.out.println(dp[i][j]);
            }
        }
        System.out.println(dp[N-1][N-1]);
    }
}
