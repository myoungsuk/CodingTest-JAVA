import java.util.*;

class Solution {
    public static int solution(int n) {

        TreeMap treeMap = new TreeMap();

        for(int i = 1; i < n+1; i++){
            if( n % i == 0) {
                treeMap.put(i , n / i);
            }
        }
        
        return treeMap.size();
    }
}