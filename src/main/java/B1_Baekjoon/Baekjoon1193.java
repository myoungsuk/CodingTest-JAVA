package B1_Baekjoon;

import java.util.Scanner;

public class Baekjoon1193 {
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        int count = 2;
        int N = sc.nextInt();
        int x = 1;
        int y = 1;

        if(N == 1){
            System.out.println("1" + "/" + "1");
            return;
        }
        if(N == 2){
            System.out.println("1" + "/" + "2");
            return;
        }
        while(true){
            if(count == N) {
                System.out.println(x + "/" + y);
                break;
            }
            y = y + 1;
            for(int i = 0; i < y; i++){
                x = 1;
                x++;
                count++;
                if(count == N){
                    System.out.println(x + "/" + y);
                    break;
                }

            }

            count++;

        }

    }

}
