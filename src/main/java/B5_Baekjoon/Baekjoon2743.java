package B5_Baekjoon;

import java.util.Scanner;

public class Baekjoon2743 {
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        String S = sc.next();
        int cnt = 0;
        for(int i = 0; i < S.length(); i++){
            cnt++;
        }
        System.out.println(cnt);
    }
}
