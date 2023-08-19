package Programmers;

import java.util.*;

public class ProgrammingBasic {
    public static void main(String[] args) {


        int n = 3;
        solution(n);
    }

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for(int i = 0; i < n; i++){
            answer[i][i] = 1;
        }

        return answer;
    }
}