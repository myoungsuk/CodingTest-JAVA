package B2_Baekjoon;

import java.util.Scanner;

public class Baekjoon10953 {
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            String c = sc.next();
            int ch = c.charAt(0)-'0';
            int ch2 = c.charAt(2)-'0';

            System.out.println(ch + ch2);
        }
    }

}
