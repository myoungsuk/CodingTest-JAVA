package B5_Baekjoon;

import java.util.Scanner;

public class Baekjoon10872 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();

        int sum = factorial(N);
        System.out.println(sum);

    }


    public static int factorial(int N){
        if(N <= 1){
            return 1;
        }

        return N * factorial(N-1);
    }
}
