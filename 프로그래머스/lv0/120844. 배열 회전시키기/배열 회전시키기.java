import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
         List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }

        if(direction.equals("right")) {
            int lastElement = list.remove(list.size() - 1);
            list.add(0, lastElement);
        }else{
            int firstElement = list.remove(0);
            list.add(list.size(), firstElement);
        }


        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}