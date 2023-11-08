package Programmers;

import java.util.*;

public class ProgrammingBasic {

    public static void main(String[] args) {

        int brown = 10;
        int yellow = 2;
        System.out.println(Arrays.toString(solution(brown, yellow)));

    }

    public static int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        int width = 0;
        int height = 0;

        for(int i = 3; i <= total/3; i++) {
            if(total % i == 0) {
                height = i;
                width = total / i;

                if((width-2) * (height-2) == yellow) {
                    break;
                }
            }
        }
        return new int[] {width, height};
    }
}
