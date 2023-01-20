package S5_Baekjoon;

import java.util.Scanner;

public class Baekjoon1436 {
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 1;
        int num = 666;

        while(count != N){
            num++;
            if(String.valueOf(num).contains("666")){
                count++;
            }
        }

        System.out.println(num);
    }
}

