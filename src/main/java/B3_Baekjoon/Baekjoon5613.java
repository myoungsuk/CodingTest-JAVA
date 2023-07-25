package B3_Baekjoon;

import java.util.Scanner;

public class Baekjoon5613 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();

        while (true) {
            String op = sc.nextLine();
            if (op.equals("=")) {
                break;
            }
            switch (op) {
                case "+":
                    sum += sc.nextInt();
                    break;
                case "-":
                    sum -= sc.nextInt();
                    break;
                case "*":
                    sum *= sc.nextInt();
                    break;
                case "/":
                    sum /= sc.nextInt();
                    break;
                default:
                    break;
            }
        }
        System.out.println(sum);
    }
}
