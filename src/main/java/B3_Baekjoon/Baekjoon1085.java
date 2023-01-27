package B3_Baekjoon;

import java.util.Scanner;

public class Baekjoon1085 {
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int xa = 0;
        int ya = 0;

        if(x - 0 < w -x){
            xa = x-0;
        }else{
            xa = w-x;
        }

        if(y - 0 < h -y){
            ya = y-0;
        }else{
            ya = h-y;
        }

        if(xa < ya){
            System.out.println(xa);
        }else{
            System.out.println(ya);
        }
    }
}
