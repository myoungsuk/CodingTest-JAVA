package B3_Baekjoon;

import java.util.Scanner;

public class Baekjoon2566 {
    public static void main(String[] args){
        var sc = new Scanner(System.in);


        int a = 0;
        int b = 0;
        int[][] arr = new int[10][10];
        int max = 0;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j] > max){
                    max = arr[i][j];
                    a = i;
                    b = j;
                }
            }
        }

        System.out.println(max);
        System.out.println((a+1)  + " " + (b+1));



    }
}
