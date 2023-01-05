package S5_Baekjoon;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Baekjoon1978 {
    public static void main(String[] args){
        var sc = new Scanner(System.in);


        int T = sc.nextInt();
        int cnt = 0;
        for(int i = 0; i < T; i++){

            int num = sc.nextInt();
            boolean is_prime = true;

            if(num == 1){
                continue;
            }
            for(int j = 2; j <= sqrt(num); j++){
                if(num % j == 0){
                    is_prime = false;
                    break;
                }
            }
            if(is_prime){
                cnt++;
            }

        }
        System.out.println(cnt);
    }

}
