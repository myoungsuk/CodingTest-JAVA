package Programmers;

import java.util.*;

public class ProgrammingBasic {
    public static void main(String[] args) {

        int numer1 = 1;
        int denom1 = 2;
        int numer2 = 3;
        int denom2 = 4;


        solution(numer1 , denom1 , numer2, denom2);

    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int a = numer1 * denom2 + numer2 * denom1;
        int b = denom1 * denom2;

        int gcd = gcd(a, b);
        a /= gcd;
        b /= gcd;

        return new int[] {a, b};
    }

    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        } else{
            return gcd(b, a % b);
        }
    }
}