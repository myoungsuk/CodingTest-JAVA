import java.util.*;

class Solution {
    public int solution(String before, String after) {
        List<String> before_list = new ArrayList<>();
        List<String> after_list = new ArrayList<>();

        for(int i = 0; i < before.length(); i++){
            before_list.add(String.valueOf(before.charAt(i)));
            after_list.add(String.valueOf(after.charAt(i)));
        }

        Collections.sort(before_list);
        Collections.sort(after_list);
        
        if(before_list.equals(after_list)){
            return 1;
        }else{
            return 0;
        }
    }
}