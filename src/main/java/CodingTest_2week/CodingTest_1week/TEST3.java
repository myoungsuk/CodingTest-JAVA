package CodingTest_2week.CodingTest_1week;

import java.util.*;

public class TEST3 {
    public static void main(String[] args) {

        String code = "5{he2{l}o}friend";
        solution(code);
    }

    public static String solution(String code) {
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < code.length()) {
            if (Character.isDigit(code.charAt(i))) {
                int start = i;
                while (i < code.length() && Character.isDigit(code.charAt(i))) {
                    i++;
                }
                int repeat = Integer.parseInt(code.substring(start, i));
                int startBracket = i;
                int count = 1;
                i++;

                while (i < code.length() && count != 0) {
                    if (code.charAt(i) == '{') count++;
                    if (code.charAt(i) == '}') count--;
                    i++;
                }
                String repeated = solution(code.substring(startBracket + 1, i - 1));

                for (int j = 0; j < repeat; j++) {
                    result.append(repeated);
                }
            } else {
                result.append(code.charAt(i));
                i++;
            }
        }
        System.out.println(result);
        return result.toString();
    }

}
