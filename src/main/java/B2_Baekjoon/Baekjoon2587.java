package B2_Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon2587 {
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;
        for(int i = 0; i < 5; i++){
            int N = sc.nextInt();
            arr[i] = N;
            sum += N;

        }
        Arrays.sort(arr);

        System.out.println(sum/5);
        System.out.println(arr[2]);
    }
}
