package Programmers;

import java.util.*;

public class ProgrammingBasic {

    public static void main(String[] args) {

        String s = "110010101001";
        System.out.println(Arrays.toString(solution(s)));

    }

    public static int[] solution(String s) {

        int transformCount = 0;
        int zeroCount = 0;

        while(!s.equals("1")) {
            int oneCount = 0;
            for(char c : s.toCharArray()) {
                if (c == '1') {
                    oneCount++;
                } else {
                    zeroCount++;
                }
            }

            s = Integer.toBinaryString(oneCount);
            transformCount++;
        }


        return new int[]{transformCount, zeroCount};
    }

}
