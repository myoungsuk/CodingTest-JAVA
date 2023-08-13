package ZeroBaseHomeWork;

import java.util.*;

public class MonthTest4_2 {
    public static void main(String[] args) {

        int[] cards = {19, 7, 18, 12, 15, 2, 17, 7, 20, 8};


        solution(10, cards);

    }

    public static int solution(int N, int[] cards) {
        Arrays.sort(cards);
        int group1 = 0, group2 = 0;

        for (int i = N - 1; i >= 0; i--) {
            if (group1 <= group2) {
                group1 += cards[i];
            } else {
                group2 += cards[i];
            }
        }

        return Math.abs(group1 - group2);
    }
}
