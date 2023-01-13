package B2_Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon25305 {
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        int N = sc.nextInt();
        int C = sc.nextInt();
        int[] arr = new int[N];
        for(int i =0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(arr[N-C]);
    }
}
