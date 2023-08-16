package Programmers;

import java.util.*;

public class ProgrammingBasic {
    public static void main(String[] args) {

        String n_str = "0010";
        solution(n_str);
    }

    public static String solution(String n_str) {

        while(n_str.startsWith("0") && n_str.length() > 1){
            n_str = n_str.substring(1);
        }
        return n_str;
    }
}