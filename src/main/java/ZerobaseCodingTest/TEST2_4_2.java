package ZerobaseCodingTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TEST2_4_2 {
    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5};
        solution(A,1);

    }

    public static int solution(int[] A, int K) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < A.length; i++) {
            for (int j = i+1; j < A.length; j++) {
                list.add(A[i] * 10 + A[j]);
                list.add(A[j] * 10 + A[i]);
            }
        }

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        return list.get(K-1);
    }
}