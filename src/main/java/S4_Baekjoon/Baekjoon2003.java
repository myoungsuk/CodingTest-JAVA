package S4_Baekjoon;

import java.util.*;

public class Baekjoon2003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] A = new int[N];
        int count = 0;

        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++){
            int sum = 0;
            for(int j = i; j < N; j++){
                sum += A[j];
                if(sum == M){
                    count++;
                }

            }
        }
        System.out.println(count);
    }
}
