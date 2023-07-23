class Solution {
    public int[] solution(String my_string) {
       int[] str = new int[52];

        for(int i = 0; i < 52; i++){
            char alp = (char) ('A' + i);
        }

        for(int i = 0; i < my_string.length(); i++){
            char ch = my_string.charAt(i);
            if(Character.isUpperCase(ch)){
                str[ch - 'A']++;
            }else{
                str[ch - 'a' + 26]++;
            }
            
        }

        return str;
    }
}