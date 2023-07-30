package Programmers;

import java.util.*;

public class ProgrammingBasic {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 100, 99, 98};

        solution(arr);

    }

    public static int solution(int[] arr) {
        int count = 0;

        while(true){
            int[] arrcopy = arr.clone();
            for(int i = 0; i < arr.length; i++){
                if(arr[i] >= 50 && arr[i] % 2 == 0){
                    arr[i] = arr[i] / 2;
                }else if(arr[i] < 50 && arr[i] % 2 == 1){
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            count++;
            System.out.println(Arrays.toString(arr));
            if(Arrays.equals(arr, arrcopy)){
                break;
            }
        }
        return count - 1;
    }
}