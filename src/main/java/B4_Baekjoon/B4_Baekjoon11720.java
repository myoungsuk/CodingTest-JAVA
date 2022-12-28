package B4_Baekjoon;

import java.util.Scanner;

public class B4_Baekjoon11720 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);

        int N = scan.nextInt();
        String str = scan.next();
        int sum = 0;

        for(int i = 0; i < N; i++){
            sum += str.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
