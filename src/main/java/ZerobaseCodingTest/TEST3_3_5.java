package ZerobaseCodingTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TEST3_3_5 {
    public static void main(String[] args) {

        int[] fruits = {-2, 5, -3, 6, 8, -1, -5, 3};
        solution(fruits);

    }

    public static int solution(int[] fruits) {
        int current = fruits[0];
        int max = fruits[0];

        for(int i = 1; i < fruits.length; i++){
            current = Math.max(fruits[i], current + fruits[i]);
            if( max < current){
                max = current;
            }
        }

        return 0;
    }
}