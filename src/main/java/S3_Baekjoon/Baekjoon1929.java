package S3_Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon1929 {
    public static boolean prime[];
    public static void main(String[] args) throws IOException {

        var br = new BufferedReader(new InputStreamReader(System.in));
        var st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        prime = new boolean[N+1];
        prime();

        for(int i = M; i <= N; i++){
            if(prime[i] == false){
                System.out.println(i);
            }
        }
    }

    public static void prime(){
        prime[0] = true;
        prime[1] = true;

        for(int i = 2; i<Math.sqrt(prime.length); i++){
            if(prime[i]){
                continue;
            }
            for(int j = i*i; j<prime.length; j = j+i){
                prime[j] = true;
            }
        }
    }
}
