package B4_Baekjoon;

import java.util.Scanner;

public class B4_Baekjoon5554 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);

        int first = line.nextInt();
        int second = line.nextInt();
        int third = line.nextInt();
        int fourth = line.nextInt();

        int time = first + second + third + fourth;

        int x = time / 60;
        int y = time % 60;

        System.out.println(x);
        System.out.print(y);


    }
}
