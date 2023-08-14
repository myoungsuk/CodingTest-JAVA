import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        
         TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for(int i = 0; i < rank.length; i++){
            if(attendance[i]){
                treeMap.put(rank[i] , i);
            }
        }
        List<Integer> list = new ArrayList<>(treeMap.values());

        return 10000*list.get(0) + 100*list.get(1) +  list.get(2);


    }
}