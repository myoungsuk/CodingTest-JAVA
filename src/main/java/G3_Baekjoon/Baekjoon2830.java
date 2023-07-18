package G3_Baekjoon;

import java.util.Scanner;

public class Baekjoon2830 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] count = new int[21];
        long answer = 0;

        for(int i = 0; i < N; i++){
            int x = sc.nextInt();
            for(int j = 0; j < count.length; j++){
                if(( x & ( 1 << j)) != 0){
                    count[j]++;
                }
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < count.length; j++){
                answer += (long) count[j] * (N - count[j]) * (1 << j);
                count[j] = 0;
            }
        }

        System.out.println(answer);
    }
}
