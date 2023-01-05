package B3_Baekjoon;

import java.util.Scanner;

public class Baekjoon10250 {
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        int T = sc.nextInt();
        int cnt = 0;

        for(int i = 0; i < T; i++){
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();
            int[] ans = new int[N];
            for(int j = 0; j < W; j++){

                ans[W] = cnt++;
                for(int k = 0; k < H; k++ ){

                    ans[H] += 100;
                    if(k == H-1){
                       ans[H] -= 100 * (H-1);
                    }

                }
            }
            System.out.println(ans[N]);
        }
    }
}
