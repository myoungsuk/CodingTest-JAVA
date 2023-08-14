package Programmers;

import java.util.*;

public class ProgrammingBasic {
    public static void main(String[] args) {

        int[] rank = {3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance = {false, true, true, true, true, false, false};
        solution(rank , attendance);
    }

    public int solution(String num_str) {

        int answer = 0;
        for(int i = 0; i < num_str.length(); i++){
            answer += Integer.parseInt(String.valueOf(num_str.charAt(i)));
        }

        return answer;
    }
}