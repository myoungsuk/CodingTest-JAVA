package ZerobaseCodingTest;

import java.util.*;

public class TEST3_3_1 {
    public static void main(String[] args) {

        int[] arr = {2, 6, 10};
        int n = 6;
        solution(arr , n);

    }

    public static int solution(int[] arr, int n) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= n){
                list.add(arr[i]);
            }
        }

        if(list.size() == 0){
            return -1;
        }else {
            return list.get(0);
        }
    }
}