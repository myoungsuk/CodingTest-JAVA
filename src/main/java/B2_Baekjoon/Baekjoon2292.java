package B2_Baekjoon;

import java.util.Scanner;

public class Baekjoon2292 {
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        int N = sc.nextInt();
        int range = 1;
        int count = 0;
        if(N == 1){
            System.out.println(1);
            return;
        }

        while(true)
        {
            count++;
            range = range + ( 6 * count);
            if(N <= range){
                System.out.println(count + 1);
                break;
            }
        }
    }
}
