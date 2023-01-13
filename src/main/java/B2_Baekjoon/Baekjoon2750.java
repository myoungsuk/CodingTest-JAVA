package B2_Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon2750 {
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            int t = sc.nextInt();
            arr[i] = t;
        }

        Arrays.sort(arr);

        for(int j = 0; j < N; j++){
            System.out.println(arr[j]);
        }
    }
}
