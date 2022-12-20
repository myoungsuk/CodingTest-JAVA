package B3_Baekjoon;

import java.util.Scanner;

public class B3_Baekjoon2588 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int first = A*(B % 10);
        int second = A*((B % 100 - B % 10)/10);
        int third = A*(B / 100);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third );
        System.out.println(first + second * 10 + third * 100);

        scanner.close();
    }
}
