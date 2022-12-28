package B3_Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Baekjoon6321 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        for(int i=0; i<testCase; i++){
            String[] textIBM = br.readLine().split("");

            System.out.println("String #"+(i+1));
            for(int j=0; j<textIBM.length; j++){
                char tmp = textIBM[j].charAt(0);
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
