package ZerobaseCodingTest;

import java.util.*;


public class TEST2_1_5 {
    public static void main(String[] args) {


        int[] arr1 = {9, 1, 1, 4, 1, 2, 3, 4};
        int[] arr2 = {5, 6, 10, 12};

        solution(arr1, arr2);
    }

    public static int[] solution(int[] arr1, int[] arr2) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j] && stack.peek() != arr2[j]){
                    stack.push(arr2[j]);
                }
            }
        }

        int[] result = new int[stack.size() -1];
        for(int i = 0; i < stack.size() - 1; i++){
            result[i] = stack.get(i+1);
        }

        Arrays.sort(result);
        return result;
    }
}