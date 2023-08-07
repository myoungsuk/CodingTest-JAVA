package ZerobaseCodingTest;

import java.util.*;

public class TEST3_5_3 {
    public static void main(String[] args) {

        int[][] A = {{1} , {2, 5}, {7, 10, 1}, {9, 4, 4, 5}};
        solution(A);

    }

    public static int solution(int[][] A) {

        //전 배열에서 고른 인덱스 값이 0 이면 0 1 인덱스 값만 갈 수 있고
        //전 배열에서 고른 인덱스 값이 1 이면 1, 2 갈수있고
        //전배열에서

        //배열의 행 수
        int rows = A.length;

        //현재 행에서의 최소 대기 시간을 저장
        int[] dp = new int[A[rows - 1].length];
        dp[0] = A[0][0];

        //각 행을 순회하면서 계산
        for(int row = 1; row < rows; row++){
            //다음 행에서의 최소 대기 시간을 저장할 배열
            int[] nextDp = new int[A[row].length];
            Arrays.fill(nextDp, Integer.MAX_VALUE);

            // 이전 행의 각 열을 탐색
            for(int col = 0; col < A[row -1].length; col++){
                int prevTime = dp[col];

                //대각선 이동, 왼쪽 이동, 오른쪽 이동을 고려
                for(int direction = -1; direction <= 1; direction++){
                    int nextCol = col + direction;

                    //현재 행의 인덱스 범위를 확인
                    if(nextCol >= 0 && nextCol < A[row].length) {
                        // 최소 시간 업데ㅣ트
                        nextDp[nextCol] = Math.min(nextDp[nextCol], prevTime + A[row][nextCol]);
                    }
                }
            }

            // 다음 행에서의 최소 대기 시간을 현재 행으로 할당
            dp = nextDp;
        }
        System.out.println(Arrays.toString(dp));
        return dp[0];
    }
}