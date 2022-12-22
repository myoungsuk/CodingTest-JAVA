package B3_Baekjoon;

import java.util.Scanner;

public class Baekjoon10707 {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int P = scanner.nextInt();

        int Xcom = A * P;
        int Ycom = 0;

        if(P > C){
            Ycom = B + ((P-C)*D);
        }else{
            Ycom = B;
        }

        if(Xcom > Ycom){
            System.out.println(Ycom);
        }else{
            System.out.println(Xcom);
        }
    }
}
