package B3_Baekjoon;

import java.util.Scanner;

public class Baekjoon14568 {
    public static void main(String[] args) {

        var scan = new Scanner(System.in);

        int N = scan.nextInt();
        int A = 0;
        int B = 0;
        int C = 0;
        int count = 0;
        int sum = 0;
        int nmg = 0;

        while (true) {
            sum = A + B + C;
            if (N == sum) {
                count++;
            }
            if (A > 0 || B > 0 || C > 0) {
                C = C + 2;
                nmg = N - C;

                if (nmg % 2 == 0) {
                    A = nmg / 2 - 1;
                    B = nmg / 2 + 1;
                } else {
                    A = nmg / 2 - 1;
                    B = nmg / 2 + 1;
                }
            }
            if (A + B < 3 || C >= N - 3) {
                break;
            }

        }
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(count);
    }
}
