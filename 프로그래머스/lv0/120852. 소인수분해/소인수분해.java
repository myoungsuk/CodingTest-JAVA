import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> prime = new LinkedHashSet<>();
        
        for(int i = 2; i <= n; i++){
            while(n % i == 0){
                prime.add(i);
                n /= i;
            }
        }
        
        int[] result = new int[prime.size()];
        int i = 0;
        
        for(int factor : prime){
            result[i++] = factor;
        }
        
        return result;
    }
}