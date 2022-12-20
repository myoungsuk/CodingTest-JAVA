package B4_Baekjoon;

import java.util.Scanner;

public class B4_Baekjoon3046 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int R1 = in.nextInt();
        int S = in.nextInt();

        int result = (S*2) - R1;

        System.out.println(result);

        in.close();
    }
}
