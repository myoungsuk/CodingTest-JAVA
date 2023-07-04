package Programmers;

import java.util.Scanner;

public class ProgrammingBasic {
    public static void main(String[] args) {


        solution(2, 91);
    }




    public static int solution(int a, int b) {
        int num = Integer.parseInt("" + a + b);

        if(num >= 2 * a * b){ return num; }
        else{ return 2 * a * b; }
    }
}
