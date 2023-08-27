import java.util.*;

class Solution {
    public String solution(String my_string) {
        String[] str = {};
        StringBuilder sb = new StringBuilder();

        my_string = my_string.toLowerCase();
        str = my_string.split("");
        Arrays.sort(str);
        
        for(int i = 0; i < str.length; i++){
            sb.append(str[i]);
        }
        
        return sb.toString();
    }
}