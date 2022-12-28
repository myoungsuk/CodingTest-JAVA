package B3_Baekjoon;

import java.util.Scanner;

public class Baekjoon11721 {
    public static void main(String[] args){
        var scan = new Scanner(System.in);

        String N = scan.next();

        for(int i = 0; i < N.length(); i++){
            char c = N.charAt(i);

            if(i == 10){
                System.out.println();
            }
            System.out.print(c);
        }



        }

    }
