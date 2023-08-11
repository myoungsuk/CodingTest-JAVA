package Programmers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ProgrammingBasic {
    public static void main(String[] args) {

        int[] arr = {0, 1, 1, 1, 0};


        solution(arr);

    }

    public static int[] solution(int[] arr) {

        int[] stk = new int[arr.length];
        int top = -1;

        for(int i = 0; i < arr.length; i++){
            if( top == -1 || stk[top] != arr[i]) {
                stk[++top] = arr[i];
            }else{
                top--;
            }
        }

        if(top == -1){
            return new int[] {-1};
        }else{
            int[] result = new int[top +1];
            for(int i = 0; i <= top; i++){
                result[i] = stk[i];
            }
            return result;
        }
    }
}