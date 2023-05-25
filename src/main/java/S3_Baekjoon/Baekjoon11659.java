package S3_Baekjoon;

import java.util.Scanner;


public class Baekjoon11659 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int N = sc. nextInt();
        int M = sc. nextInt();

        int[] arr = new int[N+1];

        for(int i = 1 ; i <= N; i++){
            arr[i] = arr[i-1] + sc.nextInt();
        }

        for(int j = 0; j < M; j++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(arr[y] - arr[x-1]);
        }


    }
}
