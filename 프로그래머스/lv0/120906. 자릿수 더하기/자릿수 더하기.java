class Solution {
    public int solution(int n) {
        int answer = 0;
        String Nstr = String.valueOf(n);

        for(int i = 0; i < Nstr.length(); i++){
            int num = Integer.parseInt(String.valueOf(Nstr.charAt(i)));
            answer += num;
        }
        return answer;
    }
}