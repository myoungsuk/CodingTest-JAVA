import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;

       Map<Integer, Integer> hm = new HashMap<>();

       for(int i = 0 ; i < lines.length; i++){
           int start = lines[i][0];
           int end = lines[i][1];

           for(int j = start; j < end; j++){
               hm.put(j, hm.getOrDefault(j,0) + 1);
           }
       }
       
       for(int value : hm.values()){
           if(value >= 2){
               answer++;
           }
       }

        return answer;
    }
}