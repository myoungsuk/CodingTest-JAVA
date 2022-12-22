package B3_Baekjoon;

import java.util.Scanner;

public class Baekjoon11586 {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        char C[][] = new char[N][N];

        for(int i = 0; i < N; i++) {
            C[i] = scanner.next().toCharArray();
        }

        int k = scanner.nextInt();

        switch(k) {
            case 1 :
                for(int i = 0; i < N; i++){
                    for(int j = 0; j < N ; j++){
                        System.out.print(C[i][j]);
                    }
                    System.out.println();
                }
                break;
            case 2 :
                for (int i = 0; i < N; i++){
                    for(int j = N-1; j >=0 ; j--){
                        System.out.print(C[i][j]);
                    }
                    System.out.println();
                }
                break;
            case 3 :
                for(int i = N-1; i >= 0; i--){
                    for(int j = 0; j < N; j++)
                        System.out.print(C[i][j]);
                    System.out.println();
                }
                break;
        }
    }
}
