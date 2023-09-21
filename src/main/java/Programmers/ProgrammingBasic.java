package Programmers;

import java.util.*;

public class ProgrammingBasic {

    public static void main(String[] args) {

        String s = "3people unFollowed me";
        System.out.println(solution(s));
;
    }

    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();

        // 처음 문자 처리
        char firstChar = s.charAt(0);
        answer.append(Character.isAlphabetic(firstChar) ? Character.toUpperCase(firstChar) : firstChar);

        for(int i = 1; i < s.length(); i++){
            //현재 문자가 공백인 경우
            if(s.charAt(i) == ' ') {
                answer.append(s.charAt(i));
                continue;
            }

            //이전 문자가 공백인 경우
            if(s.charAt(i-1) == ' ') {
                answer.append(Character.toUpperCase(s.charAt(i)));
            }else {
                answer.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        return answer.toString();
    }
}
