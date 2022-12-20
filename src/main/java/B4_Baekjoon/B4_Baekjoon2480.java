package B4_Baekjoon;

import java.util.Scanner;

public class B4_Baekjoon2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.close();

        if(a==b && b==c && a==c) {
            System.out.println(10000 + a * 1000);
        }
        else if(a == b || a == c){
            System.out.println(1000 + a * 100);
        }
        else if(b == c ){
            System.out.println(1000 + b * 100);
        }
        else{
            System.out.println(Math.max(a, (Math.max(b,c))) * 100);
        }
    }
}
