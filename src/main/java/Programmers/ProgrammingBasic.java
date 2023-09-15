package Programmers;

import java.util.*;

public class ProgrammingBasic {

    public static void main(String[] args) {

        String s = "1 2 3 4";
        System.out.println(solution(s));
;
    }

    public static String solution(String s) {
        List<Integer> numbers =  new ArrayList<>();

        String[] split = s.split(" ");

        for(String number : split) {
            numbers.add(Integer.parseInt(number));
        }

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);

        return min + " " + max;
    }
}
