package Programmers;

import java.util.*;

public class ProgrammingBasic {

    public static void main(String[] args) {

       String s = ")()(";
        System.out.println(solution(s));
;
    }

    public static boolean solution(String s) {
        boolean answer = true;

        Stack stack = new Stack();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ')' && !stack.isEmpty()){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }

        if(!stack.isEmpty()){
            return false;
        }

        return answer;
    }
}
