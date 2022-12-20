package B3_Baekjoon;

import java.util.Scanner;

public class B3_Baekjoon2525 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int time = A * 60 + B + C;

        int hour = (time / 60) % 24;
        int min = (time % 60);



        System.out.println(hour + " " + min);


    }
}
