import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        List<Integer> list = new ArrayList<>();

        String str_n = String.valueOf(n);
        for(int i = 0; i < str_n.length(); i++){
            list.add(str_n.charAt(i) - '0');
        }
        Collections.sort(list);
        Collections.reverse(list);
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < list.size(); i++){
            sb.append(list.get(i));
        }

        answer = Long.parseLong(sb.toString());

        return answer;
    }
}