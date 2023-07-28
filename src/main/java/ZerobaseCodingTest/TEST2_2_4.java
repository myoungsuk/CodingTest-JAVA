package ZerobaseCodingTest;

import java.util.HashMap;
import java.util.Map;

public class TEST2_2_4 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 1};
        solution(arr);
    }

    public static int solution(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : arr){
            map.put(i , map.getOrDefault(i , 0) + 1);
        }

        for(int i : arr){
            if(map.get(i) == 1){
                return i;
            }
        }

        return 0;
    }
}