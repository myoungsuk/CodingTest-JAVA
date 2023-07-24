package Programmers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgrammingBasic {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        int[] query = {4, 1, 2};

        solution(arr , query);
    }

    public static int[] solution(int[] arr, int[] query) {
       for(int i = 0; i < query.length; i++){
           if(i % 2 == 0 || i == 0){
             arr = Arrays.copyOfRange(arr, 0 , query[i] + 1);
           }else{
              arr = Arrays.copyOfRange(arr, query[i] +1, arr.length);
           }
       }
       return arr;
    }
}