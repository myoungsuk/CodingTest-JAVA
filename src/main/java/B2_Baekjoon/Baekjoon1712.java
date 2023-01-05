package B2_Baekjoon;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon1712 {
    public static void main(String[] args) throws IOException {

        var sc = new Scanner(System.in);

        int N = 0;
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (B >= C) {
            System.out.println(-1);
        } else
            System.out.println(A / (C - B) + 1);
    }
}
