package Programmers;

import java.util.*;

public class ProgrammingBasic {

    public static void main(String[] args) {

        int chicken = 1081;
        System.out.println(solution(chicken));
    }

    public static int solution(int chicken) {
       int coupon = chicken;
       int service = 0;

       while(coupon >= 10){
           service += coupon / 10;
           coupon = coupon / 10 + coupon % 10;
       }

       return service;
    }
}
