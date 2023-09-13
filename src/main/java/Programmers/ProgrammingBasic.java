package Programmers;

import java.util.*;

public class ProgrammingBasic {

    public static void main(String[] args) {

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(solution(array, commands)));
;
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < commands.length; i++){
            int start = commands[i][0]-1;
            int end = commands[i][1]-1;
            List<Integer> small_list = new ArrayList<>();

            for(int j = start; j <= end; j++){
                small_list.add(array[j]);
            }

            list.add(small_list);
        }

        for(int i = 0; i < list.size(); i++){
            Collections.sort(list.get(i));
            answer[i] += list.get(i).get((commands[i][2] - 1));
        }

        return answer;
    }
}
