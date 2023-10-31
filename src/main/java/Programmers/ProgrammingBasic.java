package Programmers;

import java.util.*;

public class ProgrammingBasic {

    public static void main(String[] args) {

        int n = 78;
        System.out.println(solution(n));

    }

    public static int solution(int n) {
        int answer = 0;

        String binaryN = Integer.toBinaryString(n);
        int count = 0;
        for(int i = 0; i < binaryN.length(); i++) {
            if(binaryN.charAt(i) == '1'){
                count++;
            }
        }

        while(true){
            n++;
            int count2 = 0;
            String check = Integer.toBinaryString(n);
            for(int i = 0; i < check.length(); i++){
                if(count2 > count){
                    break;
                }
                if(check.charAt(i) == '1'){
                    count2++;
                }
            }
            if(count == count2){
                answer = n;
                break;
            }
        }
        return answer;
    }

}
