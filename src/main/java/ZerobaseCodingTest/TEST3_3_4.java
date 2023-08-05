package ZerobaseCodingTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TEST3_3_4 {
    public static void main(String[] args) {

        int A = 12345;
        solution(A);

    }

    public static int solution(int A) {
        int count = 0;
        while (A != 0) {
            if (A >= 50000) {
                count += A / 50000;
                A = A % 50000;
            } else if (A >= 10000) {
                count += A / 10000;
                A = A % 10000;
            } else if (A >= 5000) {
                count += A / 5000;
                A = A % 5000;
            } else if (A >= 1000) {
                count += A / 1000;
                A = A % 1000;
            } else if (A >= 500) {
                count += A / 500;
                A = A % 500;
            } else if (A >= 100) {
                count += A / 100;
                A = A % 100;
            } else if (A >= 50) {
                count += A / 50;
                A = A % 50;
            } else if (A >= 10) {
                count += A / 10;
                A = A % 10;
            } else if (A >= 5) {
                count += A / 5;
                A = A % 5;
            } else if (A >= 1) {
                count += A;
                break;
            }
        }
        return count;
    }
}