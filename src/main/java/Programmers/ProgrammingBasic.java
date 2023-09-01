package Programmers;

import java.util.*;

public class ProgrammingBasic {

    public static void main(String[] args){

        int[] sides =  {3, 6};

        System.out.println(solution(sides));
    }

    public static int solution(int[] sides) {
        int answer = 0;
        int min = Math.min(sides[0], sides[1]);
        int max = Math.max(sides[0], sides[1]);

        for(int i = min; i <= max; i++){
            if(max < i + min){
                answer++;
            }
        }

        for(int i = max + 1; i <= max + min; i++){
            if(i < max + min){
                answer++;
            }
        }

        return answer;
    }
}
