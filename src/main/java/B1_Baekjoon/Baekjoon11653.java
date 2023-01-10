package B1_Baekjoon;

import java.util.Scanner;

public class Baekjoon11653 {
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        int N = sc.nextInt();
        int i = 2;
        while(true)
        {
            if((N % i == 0)){
                System.out.println(i);
                N = N/i;
            }else{
                i++;
            }

            if(N == 1){
                break;
            }
        }
    }
}
