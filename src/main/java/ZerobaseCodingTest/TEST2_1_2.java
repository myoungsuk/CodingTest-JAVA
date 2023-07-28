package ZerobaseCodingTest;

import java.util.*;

public class TEST2_1_2 {
    public static void main(String[] args) {

        int[] arr = {2, 3, 3, 3, 20};
        solution(arr);
    }

    public static int solution(int[] arr) {
        int answer = 0;

        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 2; i++){
            answer += arr[i + 1];
        }
        return answer/(arr.length-2);
    }
}