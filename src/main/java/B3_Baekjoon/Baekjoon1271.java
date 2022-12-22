package B3_Baekjoon;

import java.util.Scanner;

public class Baekjoon1271 {
    public static void main(String[] args){
        var scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int amount = n / m;
        int sum = n % 10;

        System.out.println(amount);
        System.out.println(sum);

    }
}
