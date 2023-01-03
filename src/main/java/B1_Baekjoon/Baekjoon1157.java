package B1_Baekjoon;

import java.util.Scanner;

public class Baekjoon1157 {
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        int[] arr = new int[26];
        String S = sc.next();
        int max = -1;
        char ch = '?';



        for(int j = 0; j < S.length(); j++){
            if('A' <= S.charAt(j)  && S.charAt(j) <= 'Z'){
                arr[S.charAt(j) - 'A']++;
            }
            else{
                arr[S.charAt(j) - 'a']++;
            }

        }
        for(int i = 0; i< 26; i++){
            if(arr[i] > max){
                max = arr[i];
                ch = (char) (i + 65);
            }
            else if(arr[i] == max){
               ch = '?';
            }
        }
        System.out.println(ch);
    }
}
