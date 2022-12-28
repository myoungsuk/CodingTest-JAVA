package B4_Baekjoon;

import java.util.Scanner;

public class Baekjoon10808 {
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        String S = sc.next();
        int[] arr = new int[26];

        for(int j = 0; j < S.length(); j++){
            arr[S.charAt(j) -97]++;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }
}
