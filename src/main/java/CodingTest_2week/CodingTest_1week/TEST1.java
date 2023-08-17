package CodingTest_2week.CodingTest_1week;

import java.util.*;

public class TEST1 {
    public static void main(String[] args) {

        int[] numbers = {26, 62, 34, 52, 15, 17, 16, 20, 19, 18};
        solution(numbers);
    }

    public static int solution(int[] numbers) {

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int answer = 0;
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] - numbers[i-1] != 1){
                System.out.println("numbers[i-1]" + numbers[i-1]);
                answer = numbers[i-1] + 1;
                break;
            }
        }
        System.out.println(answer);
        return answer;
    }

}
