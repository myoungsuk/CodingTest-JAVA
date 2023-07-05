package Programmers;

import java.util.Arrays;
import java.util.Scanner;

public class ProgrammingBasic {
    public static void main(String[] args) {

        int[] numbers = {34, 5, 71, 29, 100, 34};
        solution(numbers , 123);

    }

    public static int solution(int[] numbers, int n) {
        int answer = 0;
        int sum = 0;

        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
            if(sum > n){
                answer = sum;
                break;
            }
        }
        return answer;
    }

}
