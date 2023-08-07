package ZerobaseCodingTest;

public class TEST3_4_1 {
    public static void main(String[] args) {

        solution(5, 3);

    }

    public static int solution(int n, int k) {
        //k로 1, 2, 3등 가는 경우 그 전거랑 같지 않은 값에 대해서 추가하기
        int mod = 1000000007;

        int[][] dp = new int[n+1][k+1];
        int[] sums = new int[n+1];

        for(int i = 1; i <= k; ++i) {
            dp[i][i] = 1;
        }
        sums[0] = 1;

        for(int i = 1; i <= n; ++i) {
            for (int j = 1; j <= k; ++j) {
                if(i - j > 0) {
                    dp[i][j] = (sums[i-j] - dp[i-j][j] + mod) % mod;
                }
            }
            sums[i] = 0;
            for(int val : dp[i]) {
                sums[i] = (sums[i] + val) % mod;
            }
        }
        System.out.println(sums[n]);
        return sums[n];
    }
}