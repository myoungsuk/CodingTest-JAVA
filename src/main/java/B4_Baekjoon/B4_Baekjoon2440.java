package B4_Baekjoon;

import java.util.Scanner;

public class B4_Baekjoon2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            for(int j = 1;  j <= N -i; j++)
            {
                System.out.print("*");
            }
            for(int k = 1; k <= i ; k++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
