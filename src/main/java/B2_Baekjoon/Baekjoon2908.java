package B2_Baekjoon;

import java.util.Scanner;

public class Baekjoon2908 {
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        var sa = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
        var sb = Integer.parseInt(new StringBuilder().append(B).reverse().toString());

        if(sa > sb){
            System.out.println(sa);
        }
        else{
            System.out.println(sb);
        }


    }
}
