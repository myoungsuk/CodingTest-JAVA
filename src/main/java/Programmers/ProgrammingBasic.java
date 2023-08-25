package Programmers;

import java.util.*;

public class ProgrammingBasic {

    public static void main(String[] args) {

        int[] sides = {1, 2, 3};
        System.out.println(solution(sides));
    }

    public static int solution(int[] sides) {
        Arrays.sort(sides);
        if(sides[0] + sides[1] > sides[2]){
            return 1;
        }
        return 2;
    }

}
