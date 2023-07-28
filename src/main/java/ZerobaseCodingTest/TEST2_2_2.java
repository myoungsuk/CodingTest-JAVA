package ZerobaseCodingTest;

import java.util.*;

public class TEST2_2_2 {
    public static void main(String[] args) {

        int[] arr = {0, 2, 1, 4, 3, 0};
        solution(arr);
    }

    public static int[] solution(int[] arr) {
        int[] result = new int[arr.length];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            if (arr[i] % 2 == 1) {
                    list.add(arr[i]);
            }
        }

        for(int i = 0; i < arr.length; i++){
            result[i] = list.get(i);
        }

        return result;
    }
}