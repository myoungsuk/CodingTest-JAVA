package B5_Baekjoon;

import java.util.Scanner;

public class Baekjoon10809 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);

        String S = scan.next();
        int[] arr = new int[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        for(int i = 0; i < S.length(); i++){
            char ch = S.charAt(i);

            if(arr[ch -'a'] == -1){
                arr[ch - 'a'] = i;
            }
        }

        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}
