package B3_Baekjoon;

import java.util.Scanner;

public class B3_Baekjoon2442 {
    public static void main(String[] args) {

        var in = new Scanner(System.in);

        int N = in.nextInt();
        int i = 0;

        for (i = 1; i <= N; i++) {

            for (int j = 1; j <= N-i; j++)
            {
                System.out.print(" ");
            }


            for (int k = 1; k <= 2*i-1; k++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
