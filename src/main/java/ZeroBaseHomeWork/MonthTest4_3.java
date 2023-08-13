package ZeroBaseHomeWork;

import java.util.*;

public class MonthTest4_3 {
    public static void main(String[] args) {

        int[][] reserved = {{3, 7}, {4, 8}, {1, 2}, {7, 10}, {4, 7}};

        solution(5, reserved);

    }

    public static int solution(int N, int[][] reserved) {
            int count = 0;
            int end = 0;

            Arrays.sort(reserved, (a, b) -> {
               int compare =  Integer.compare(a[1] , b[1]);
               if(compare == 0){
                   return Integer.compare(a[0], b[0]);
               }
               return compare;
            });

            for(int i = 0; i < N; i++){
                if(reserved[i][0] >= end){
                    count++;
                    end = reserved[i][1];
                }
            }
            return count;
    }
}
