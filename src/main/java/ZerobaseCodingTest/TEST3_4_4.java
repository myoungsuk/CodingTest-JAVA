package ZerobaseCodingTest;

import java.util.*;

public class TEST3_4_4 {
    public static void main(String[] args) {

        int[] arr = {1, 0, 1, 1, 1, 0};
        solution(arr);

    }

    public static int solution(int[] arr) {
        int[] count = new int[arr.length];
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                count[j]++;
            }else if(arr[i] == 0){
                j++;
            }
        }
        Arrays.sort(count);
        return count[arr.length -1];

    }
}