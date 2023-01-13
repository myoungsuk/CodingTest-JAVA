package S5_Baekjoon;

import java.util.Scanner;

public class Baekjoon2563 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 0;
        int[][] arr = new int[100][100];

        for (int k = 0; k < N; k++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for (int i = a; i < a + 10; i++) {
                for (int j = b; j < b + 10; j++) {
                    arr[i][j] = 1;
                }
            }
        }

        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                if(arr[i][j] == 1){
                    count += 1;
                }
            }
        }

        System.out.println(count);


    }
}
