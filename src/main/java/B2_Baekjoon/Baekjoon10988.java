package B2_Baekjoon;

import java.io.*;
import java.util.Scanner;

public class Baekjoon10988 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int ans = 1;

        for (int i = input.length() - 1; i >= 0; i--) {
            char c = input.charAt(i);

            if (c != input.charAt(input.length() - i - 1)) {
                ans = 0;
            }
        }
        bw.write(ans + "\n");
        bw.flush();
        bw.close();
        br.close();


    }
}
