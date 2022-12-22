package B3_Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Baekjoon6321 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            String[] text = br.readLine().split("");

            System.out.println("String #" + i+1);

            for(int j = 0; j < text.length; j++){
                char tmp = text[j].charAt(0);
                tmp += 1;
                if(tmp == 91){
                    tmp = 65;
                }
                System.out.print(tmp);
            }
            System.out.println();
            System.out.println();

        }
    }
}
