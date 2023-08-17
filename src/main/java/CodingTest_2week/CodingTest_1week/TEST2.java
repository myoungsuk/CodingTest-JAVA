package CodingTest_2week.CodingTest_1week;

import java.util.Arrays;
import java.util.Stack;

public class TEST2 {
    public static void main(String[] args) {

        int[] a = {5, 2, 1, 4, 6};
        int[] b = {6, 1, 0, 4, 4};

        solution(a, b);
    }

    public static int[] solution(int[] a, int[] b) {
        int A = a.length - 1;
        int B = b.length - 1;
        int up = 0;
        Stack<Integer> stack = new Stack<>();

        while (A >= 0 || B >= 0 || up > 0) {
            int sum = up;

            if (A >= 0) {
                sum += a[A];
                A--;
            }
            if (B >= 0) {
                sum += b[B];
                B--;
            }

            stack.push(sum % 10);
            up = sum / 10;
        }

        int[] answer = new int[stack.size()];
        int i = 0;
        if(answer.length == 0){
            return new int[] {};
        }
        while(!stack.isEmpty()){
            answer[i] = stack.pop();
            i++;
        }

        return answer;


    }
}
