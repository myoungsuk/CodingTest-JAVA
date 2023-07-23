import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<Integer> solution(int[] arr, int[][] intervals) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < intervals.length; i++){
            int first = intervals[i][0];
            int second = intervals[i][1];
            
            for(int j = first; j <= second; j++){
                 answer.add(arr[j]);
            }
        }
        
        return answer;
    }
}