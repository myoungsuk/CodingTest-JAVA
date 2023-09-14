import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
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

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}