package Programmers;

import java.util.*;

public class ProgrammingBasic {
    public static void main(String[] args) {

        solution("ab6CDE443fgh22iJKlmn1o", "6CD");
    }

    public static int solution(String str1, String str2) {

        if(str1.contains(str2)){
            return 1;
        }else{
            return 2;
        }
    }
}