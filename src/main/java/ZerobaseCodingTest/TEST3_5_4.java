package ZerobaseCodingTest;

import java.util.*;

public class TEST3_5_4 {
    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5};
        solution(A, 15);

    }

    public static int solution(int[] A, int K) {

        Arrays.sort(A);
        int count = 0;
        int sum = 0;

        for(int value : A){
            if(sum + value <= K){
                sum += value;
                count++;
            }else{
               break;
            }
        }
        System.out.println(count);
        return count;
    }
}