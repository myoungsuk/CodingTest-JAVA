package ZerobaseCodingTest;

import java.util.*;

public class TEST2_5_3 {
    public static void main(String[] args) {

        int[] cards = {4, 8, 6, 1, 2};

        solution(cards);

    }

    public static int solution(int[] cards) {
        List<Integer> cardlist = new ArrayList<>();

        for(int i = 0; i < cards.length; i++){
            cardlist.add(cards[i]);
        }

        while(cardlist.size() > 1){
            Collections.sort(cardlist);
            int a = cardlist.get(cardlist.size() -1);
            int b = cardlist.get(cardlist.size() -2);

            cardlist.remove(cardlist.size() -1);
            cardlist.remove(cardlist.size() -1);
            cardlist.add(a - b);
        }
        return cardlist.get(0);
    }
}