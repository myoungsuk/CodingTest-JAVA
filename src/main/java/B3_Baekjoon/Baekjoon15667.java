package B3_Baekjoon;

import java.util.Scanner;

public class Baekjoon15667 {
    public static void main(String[] args){

        var scan = new Scanner(System.in);

        int N = scan.nextInt();
        int firework = 1;

        while(firework != 10){
            int sum = 1;
            sum = sum + firework + (firework * firework);

            if(sum == N){
                break;
            }
            else{
                firework++;
            }
        }
        System.out.println(firework);


    }
}
