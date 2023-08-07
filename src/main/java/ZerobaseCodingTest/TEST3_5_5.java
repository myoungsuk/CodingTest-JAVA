package ZerobaseCodingTest;

import java.util.*;

public class TEST3_5_5 {
    public static void main(String[] args) {

        int[] arr = {1000, 1000, 100};
        solution(arr);

    }

    public static List<Integer> solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int money = 0;

        int[] coins = {500, 100, 50, 10};

        int last = 0;
        for(int i : arr) {
           money += i;
        }

        for(int i = arr.length -1; i>= 0; i--){
            if(arr[i] == 1000 || arr[i] == 5000 || arr[i] == 10000){
                last = arr[i];
                break;
            }
        }

        if(last != 0){
            list.add(last);
            money -= last;
        }

        for (int coin : coins) {
            int count = money / coin;
            for (int j = 0; j < count; j++) {
                list.add(coin);
            }
            money = money % coin;
        }
        System.out.println(list);
        return list;
    }
}