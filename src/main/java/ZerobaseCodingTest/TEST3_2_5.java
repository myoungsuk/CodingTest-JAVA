package ZerobaseCodingTest;

import java.util.*;

public class TEST3_2_5 {
    public static void main(String[] args) {

        int[] arr = {10, 1, 5};
        int n = 9;
        solution(arr , n);

    }

    public static int solution(int[] arr, int n) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= n){
                list.add(arr[i]);
            }
        }

        if(list.size() == 0){
            return -1;
        }
        Collections.sort(list);
        return list.get(list.size()-1);
    }
}