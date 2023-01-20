package S4_Baekjoon;

import java.util.Scanner;

public class Baekjoon1018 {

    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args){
        var sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        arr = new boolean[n][m];

        for(int i = 0; i < n; i++){
            String str = sc.next();

            for(int j = 0; j < m; j++){
                if(str.charAt(j) == 'W'){
                    arr[i][j] = true;
                }else{
                    arr[i][j] = false;
                }
            }
        }

        int N_row = n-7;
        int M_col = m-7;

        for(int i = 0; i < N_row; i++){
            for(int j = 0; j < M_col; j++){
                find(i,j);
            }
        }

        System.out.println(min);
    }

    public static void find(int x,int y){
        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;

        boolean TF = arr[x][y];

        for(int i = x; i < end_x; i++){
            for(int j = y; j < end_y; j++){

                if(arr[i][j] != TF){
                    count++;
                }

                TF = (!TF);
            }
            TF = !TF;
        }

        count = Math.min(count, 64-count);
        min = Math.min(min, count);

    }
}