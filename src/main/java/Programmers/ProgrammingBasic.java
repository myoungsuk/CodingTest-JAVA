package Programmers;

import java.util.*;

public class ProgrammingBasic {

    public static void main(String[] args) {

        int[] common = {1, 2, 3, 4};
        System.out.println(solution(common));
    }

    public static int solution(int[] common) {
       int check_first = common[1] - common[0];

       boolean check = true;
       for(int i = 1; i < common.length; i++){
           if(common[i] - common[i-1] != check_first) {
               check = false;
               break;
           }
       }

       if(check){
           return common[common.length-1] + check_first;
       }

       int check_sec = common[1] / common[0];
       return common[common.length -1] * check_sec;

    }
}
