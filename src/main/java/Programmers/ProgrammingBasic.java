package Programmers;

import java.util.*;

public class ProgrammingBasic {

    public static void main(String[] args) {

        int n = 45;
        System.out.println(solution(n));
;
    }

    public static int solution(int n) {
        int answer = 0;

        String num = Integer.toString(n, 3);

        StringBuilder sb = new StringBuilder();
        String str_num = String.valueOf(num);
        for(int i = str_num.length() - 1; i >= 0; i--){
            sb.append(str_num.charAt(i));
        }

        System.out.println(sb);
        return answer;
    }
}
