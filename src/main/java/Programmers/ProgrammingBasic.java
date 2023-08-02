package Programmers;

import java.util.*;

public class ProgrammingBasic {
    public static void main(String[] args) {

        String my_string = "i love you";
        solution(my_string);

    }

    public static String[] solution(String my_string) {
        String[] str = my_string.split(" ");
        return str;
    }
}