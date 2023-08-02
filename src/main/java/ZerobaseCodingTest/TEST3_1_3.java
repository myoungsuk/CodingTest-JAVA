package ZerobaseCodingTest;

import java.util.*;

public class TEST3_1_3 {
    public static void main(String[] args) {


        solution(2);

    }

    public static long solution(int n) {
        // 홀수인 경우 101 111 ...  191 등등으로 가운데가 0 에서 9 첫번째가 1에서 9 총 90
        // 짝수인 경우 첫번째 자리가 1에서 9 그러므로 9가지가 나온다
        // 자리수가 n인 팰린드롬의 개수를 구하기 위해선 자리수 절반인 n/2의 자릿수에 대해 경우의 수 계산

        long mod = 1000000007;

        long dp[] = new long[n / 2 + 1];
        dp[0] = 1;

        for (int i = 1; i < n / 2; i++) {
            dp[i] = (dp[i-1] * 10) % mod;
        }

        if( n % 2 == 0){
           return (9 * dp[n/2 - 1]) % mod;
        }else{
            return (9 * dp[n/2] * 10) % mod;
        }

    }
}