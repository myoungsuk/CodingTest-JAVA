package ZerobaseCodingTest;

import java.util.*;

public class TEST2_1 {
    public static void main(String[] args) {

        int[] arr = {6, 2, 12, 8, 5, 9};
        solution(arr);
    }

    public static int solution(int[] arr) {
        int answer = 0;

        Arrays.sort(arr);

        for(int i = arr.length - 1; i >= 2; i--){
            if(arr[i] < arr[i-1] + arr[i-2]){
                return arr[i] + arr[i -1] + arr[i-2];
            }else{
                continue;
            }
        }
        return answer;
    }
}