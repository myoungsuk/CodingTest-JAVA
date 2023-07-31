package Programmers;

import java.util.*;

public class ProgrammingBasic {
    public static void main(String[] args) {

        String[] strArr = {"AAA","BBB","CCC","DDD"};


        solution(strArr);

    }

    public static String[] solution(String[] strArr) {
        for(int i = 0; i < strArr.length; i++){
            if(i % 2 == 1){
                strArr[i].toUpperCase();
            }else{
                strArr[i].toLowerCase();
            }
        }
        System.out.println(Arrays.toString(strArr));
        return strArr;
    }
}