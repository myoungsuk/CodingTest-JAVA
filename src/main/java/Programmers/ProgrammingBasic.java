package Programmers;

import java.util.*;

public class ProgrammingBasic {

    public static void main(String[] args) {

        int[][] score = {{80, 70}, {90, 50}, {40 , 70}, {50, 80}};

        System.out.println(Arrays.toString(solution(score)));
    }

    public static int[] solution(int[][] score) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < score.length; i++){
          list.add((score[i][0] + score[i][1]) / 2);
        }

        List<Integer> sortedlist = new ArrayList<>(list);

        System.out.println(list);

        Collections.sort(sortedlist, Collections.reverseOrder());

        System.out.println(list);

        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for(Integer number : sortedlist) {
            rankMap.put(number, rank);
            rank++;
        }

        System.out.println(rankMap);
        return answer;
    }

}
