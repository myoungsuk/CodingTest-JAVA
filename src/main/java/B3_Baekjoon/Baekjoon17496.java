package B3_Baekjoon;

import java.util.Scanner;

public class Baekjoon17496 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);

        int N = scan.nextInt();
        int T = scan.nextInt();
        int C = scan.nextInt();
        int P = scan.nextInt();

        int A = ((N-1) / T) * C;
        int ans = A * P;

        System.out.println(ans);
    }
}
