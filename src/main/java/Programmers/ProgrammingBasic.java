package Programmers;

import java.util.*;

public class ProgrammingBasic {

    public static void main(String[] args) {

        String my_string = "bus";
        solution(my_string);
    }

    public static String solution(String my_string) {
        String checkSpell= "aeiou";

        for(int i = 0; i < checkSpell.length(); i++){
            char ch = checkSpell.charAt(i);
            my_string = my_string.replace(String.valueOf(ch), "");
        }

        return my_string;
    }
}
