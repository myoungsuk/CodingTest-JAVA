class Solution {
    public String solution(String s, int n) {
        String alp_big = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alp_small = "abcdefghijklmnopqrstuvwxyz";

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                sb.append(" ");
            }
            for(int j = 0; j < alp_big.length(); j++){
                if(alp_big.charAt(j) == ch){
                  sb.append(alp_big.charAt((j+n) % alp_big.length()));
                }else if(alp_small.charAt(j) == ch){
                    sb.append(alp_small.charAt((j+n) % alp_small.length()));
                }
            }
        }

        return sb.toString();
    }
}