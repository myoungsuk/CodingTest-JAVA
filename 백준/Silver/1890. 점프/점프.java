import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] NN = new int[N][N];
        long[][] dp = new long[N][N];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                NN[i][j] = sc.nextInt();
            }
        }

        dp[0][0] = 1;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(NN[i][j] == 0){
                    continue;
                }
                if(j + NN[i][j] < N){
                    dp[i][j + NN[i][j]] += dp[i][j];
                }
                if(i + NN[i][j] < N){
                    dp[i +  NN[i][j]][j] += dp[i][j];
                }
            }

        }
        System.out.println(dp[N-1][N-1]);
    }
}
