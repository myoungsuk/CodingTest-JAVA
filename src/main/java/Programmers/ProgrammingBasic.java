package Programmers;

import java.util.*;

public class ProgrammingBasic {

    public static void main(String[] args) {

        int n = 24;
        System.out.println(solution(n));
    }

    public static List<Integer> solution(int n) {

        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                list.add(i);
            }
        }

        return list;
    }



}
