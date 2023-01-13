package S3_Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon2108 {
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] count = new int[N];
        int max = 0;

        int sum = 0;
        for(int k = 0; k < N; k++){
            count[k] = 0;
        }
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        for(int m = 0; m < N; m++){

        }
        for(int j = 0; j < N; j++){
            max = count[j];
            if(count[j] > max){
                max = count[j];
            }
        }
        Arrays.sort(arr);


        //산술평균
        System.out.println(sum/N);
        //중앙값구하기
        System.out.println(arr[N/2 -1]);
        //최빈값구하기
        if(max == 0){
            System.out.println(arr[1]);
        }
        else{
            System.out.println();
        }
        //최대값 최소값 차이
        System.out.println(arr[N] - arr[0]);

    }
}
