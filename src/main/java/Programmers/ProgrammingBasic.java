package Programmers;

import java.util.*;

public class ProgrammingBasic {

    public static void main(String[] args) {

        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        System.out.println(Arrays.toString(solution(n, arr1, arr2)));

    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {

        String[] answer = new String[n];

        for(int i = 0; i < n; i++){

            String binary1 = String.format("%" + n + "s", Integer.toBinaryString(arr1[i]).replace(' ', '0'));
            String binary2 = String.format("%" + n + "s", Integer.toBinaryString(arr2[i]).replace(' ', '0'));

            StringBuilder row = new StringBuilder();

            for(int j = 0; j < n; j++){
                row.append((binary1.charAt(j) == '1' || binary2.charAt(j) == '1') ? "#" : " ");
            }
            answer[i] = row.toString();
        }

        return answer;
    }
}
