package CodingTest_1week;

public class TEST3 {
    public static void main(String[] args){

        solution(4);
    }

    public static int solution(int N) {
        // 맥주의 가로배치 2 * 1
        // 맥주의 세로배치 1 * 2
        // 맥주의 개수 주어지면 직사각형으로 배치 위 아래 길이가 같고 왼 오 길이가 같아야댐
        // 높이4까지 N*2의 직사각형 형태로 쌓아올리기

        int[] dp = new int[N+1];
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= N; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[N];
    }
}
