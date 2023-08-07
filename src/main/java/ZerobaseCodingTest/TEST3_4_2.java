package ZerobaseCodingTest;

public class TEST3_4_2 {
    public static void main(String[] args) {

        int[] A = {-2, -8, 3, -2, 4, -10};
        solution(A);

    }

    public static int solution(int[] A) {
        int dp = A[0];
        int max = A[0];

        for(int i = 1; i < A.length; i++){
            dp = Math.max(A[i],  dp + A[i]);
            if(dp > max){
                max = dp;
            }
        }
        if(max < 0){
            return 0;
        }
        return max;
    }
}