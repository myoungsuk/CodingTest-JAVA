package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgrammingBasic {
    public static void main(String[] args) {

        solution("aacddefg");
    }

    public static String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                continue;

            } else if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                continue;
            }
            sb.append(s.charAt(i));
            System.out.println(sb);

        }
        answer = sb.toString();
        return answer;
    }

}