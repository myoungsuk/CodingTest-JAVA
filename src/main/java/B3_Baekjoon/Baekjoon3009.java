package B3_Baekjoon;

import java.util.Scanner;

public class Baekjoon3009 {
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        int[] xy1 = {sc.nextInt() , sc.nextInt()};
        int[] xy2 = {sc.nextInt() , sc.nextInt()};
        int[] xy3 = {sc.nextInt() , sc.nextInt()};

        int x = 0;
        int y = 0;


        if(xy1[0] == xy2[0]){
            x = xy3[0];
        }else if(xy1[0] == xy3[0]){
            x = xy2[0];
        }else{
            x = xy1[0];
        }
        if(xy1[1] == xy2[1]){
            y = xy3[1];
        }else if(xy1[1] == xy3[1]){
            y = xy2[1];
        }else{
            y = xy1[1];
        }

        System.out.println(x + " " + y);
    }
}
