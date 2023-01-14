package B2_Baekjoon;

import java.util.Scanner;

public class Baekjoon10870 {
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();

        int sum = Finbonacci(N);
        System.out.println(sum);
    }

    public static int Finbonacci(int N){

        if(N == 0){
            return 0;
        }else if(N == 1){
            return 1;
        }
        return Finbonacci(N-2) + (Finbonacci(N-1));
    }
}
