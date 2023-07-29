package ZerobaseCodingTest;

import java.util.ArrayList;
import java.util.List;

public class TEST2_4_1 {
    public static void main(String[] args) {

        solution(25, 2);

    }

    public static int solution(int N, int K) {
        int count = 0;

        for(int i = 0; i <= N; i++){
            int temp = i;
            while(temp > 0){
                if(temp % 10 == K){
                    count++;
                }
                temp /= 10;
            }
        }
       return count;
    }
}