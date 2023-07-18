package B5_Baekjoon;

import java.util.HashMap;
import java.util.Scanner;

public class Baekjoon10807 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int[] numlist = new int[201];

       for(int i = 0; i < N; i++){
           int num = sc.nextInt();
           numlist[num]++;
       }

       int v = sc.nextInt();
       System.out.println(numlist[v]);
    }
}
