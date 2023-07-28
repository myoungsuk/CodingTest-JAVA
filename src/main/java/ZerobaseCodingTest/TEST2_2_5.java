package ZerobaseCodingTest;

import java.util.*;

public class TEST2_2_5 {
    public static void main(String[] args) {


        solution(340);
    }

    public static int solution(int num) {
        Stack<Integer> stack = new Stack<>();
        boolean Minus = num < 0;
        if(Minus) num = - num;

        while( num > 0){
            stack.push(num%10);
            num /= 10;
        }

       int reverse = 0;
        int position = 1;

       while(!stack.isEmpty()){
           reverse += stack.pop() * position;
           position *= 10;
       }


        System.out.println(reverse);
        return Minus ? -reverse : reverse;
    }
}