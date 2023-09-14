package Programmers;

import java.util.*;

public class ProgrammingBasic {

    public static void main(String[] args) {

        int[] numbers = {2, 1, 3, 4, 1};
        System.out.println(Arrays.toString(solution(numbers)));
;
    }

    public static int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < numbers.length; i++){
            int num = numbers[i];
            for(int j = i + 1; j < numbers.length; j++){
                int sum = num + numbers[j];
                if(!list.contains(sum)){
                    list.add(sum);
                }
            }
        }
        Collections.sort(list);

        int answer = 256 - 131 - 26 - 11 - 128;
        System.out.println(answer);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
