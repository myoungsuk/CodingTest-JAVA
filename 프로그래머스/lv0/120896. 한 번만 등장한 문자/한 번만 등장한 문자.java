import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";

        int[] alp = new int[26];

        for(int i = 0; i <s.length(); i++){
            char ch = s.charAt(i);
                alp[ch - 'a']++;
        }

        for(int i = 0; i < alp.length; i++){
            if(alp[i] == 1){
                char ch = (char) (i+'a');
                answer += ch;
            }
        }
        Arrays.sort(answer.toCharArray());
        
        return answer;
    }
}