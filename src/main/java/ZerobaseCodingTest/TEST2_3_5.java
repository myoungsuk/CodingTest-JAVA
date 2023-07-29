package ZerobaseCodingTest;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;

public class TEST2_3_5 {
    public static void main(String[] args) {

        solution(7, 3);

    }

    public static int solution(int N, int K) {
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= N; i++){
           list.add(i);
        }

        int i = K - 1;
        while(list.size() > 1){
            list.remove(i);
            if(list.size() > 0 ){
                i = (i + K - 1) % list.size();
            }
        }

        return list.get(0);
    }
}