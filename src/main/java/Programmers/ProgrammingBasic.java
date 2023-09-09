package Programmers;

import java.util.*;

public class ProgrammingBasic {

    public static void main(String[] args) {

        String N = "123";
        System.out.println(solution(N));
    }

    public static int solution(int n) {
        String N = String.valueOf(n);
        int answer = 0;
        for (int i = 0; i < N.length(); i++) {
            int c = N.charAt(i) - '0';
            answer += c;
        }

        return answer;
    }
}
