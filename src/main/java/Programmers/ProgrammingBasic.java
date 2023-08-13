package Programmers;

import java.util.*;

public class ProgrammingBasic {
    public static void main(String[] args) {

        int[] arr = {0, 1, 1, 1, 1};
        solution(arr, 4);
    }

    public static List<Integer> solution(int[] arr, int k) {

        List<Integer> list = new ArrayList<>();
        int count = 0;

        for(int i = 0; i < arr.length && count < k; i++){
            if(i == 0 || arr[i] != arr[i-1]) {
                list.add(arr[i]);
                count++;
            }
        }

        while(list.size() < k){
            list.add(-1);
        }

        return list;
    }
}