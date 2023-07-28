package ZerobaseCodingTest;

import java.util.*;

public class TEST2_3_4 {
    public static void main(String[] args) {

        solution(29, 15);

    }

    public static int solution(int A, int B) {
        int answer = 0;
        String Abinary = Integer.toBinaryString(A);
        String Bbinary = Integer.toBinaryString(B);
        int diff = Math.abs(Abinary.length() - Bbinary.length());

        if(Abinary.length() > Bbinary.length()){
            Bbinary = String.format("%0" + diff +"d"  ,0) + Bbinary;
        }else if(Bbinary.length() > Abinary.length()){
            Abinary = String.format("%0" + diff + "d", 0) + Abinary;
        }

        for(int i = 0; i < Abinary.length(); i++){
            if(Abinary.charAt(i) == Bbinary.charAt(i)){
                continue;
            }else{
                answer++;
            }
        }

        return answer;
    }
}