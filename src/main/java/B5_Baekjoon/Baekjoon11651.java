package B5_Baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Baekjoon11651 {
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] arr = new int[N][2];

        for(int i = 0; i < N; i++){
            arr[i][1] = sc.nextInt();
            arr[i][0] = sc.nextInt();
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o2[0] == o1[0]){
                    return o1[1] - o2[1];
                }else{
                    return o1[0] - o2[0];
                }

            }
        });

        for(int i = 0; i < N; i++){
            System.out.println(arr[i][1] + " " + arr[i][0]);
        }
    }
}
