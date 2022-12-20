package B4_Baekjoon;

import java.util.Scanner;

public class B4_Baekjoon2530 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int h = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();

        int time = in.nextInt();

        int mplus = time/60;

        if(mplus > 60){
            h = h + 1;
        }
        s = time % 60;
        m = mplus + m;

    }
}
