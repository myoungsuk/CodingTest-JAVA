package Programmers;

import java.util.*;

public class ProgrammingBasic {

    public static void main(String[] args) {

        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
        System.out.println(Arrays.toString(solution(quiz)));
    }

    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for(int i = 0; i < quiz.length; i++){
            String[] parts = quiz[i].split(" ");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[2]);
            int z = Integer.parseInt(parts[4]);
            String operator = parts[1];

            System.out.println(Arrays.toString(parts));
            if(operator.equals("+")){
                answer[i] = (x + y == z) ? "O" : "X";
            }else{
                answer[i] = (x - y == z) ? "O" : "X";
            }
        }

        return answer;
    }



}
