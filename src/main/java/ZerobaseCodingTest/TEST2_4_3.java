package ZerobaseCodingTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TEST2_4_3 {
    public static void main(String[] args) {


        solution("HelloWorld" , "WorldHello");

    }

    public static int solution(String S1, String S2) {
        String str = S1 + S1;

        if(str.contains(S2)){
            return 1;
        }else {
            return 0;
        }

    }
}