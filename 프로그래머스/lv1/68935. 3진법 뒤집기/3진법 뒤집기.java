class Solution {
    public int solution(int n) {
        String num = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder();

        for(int i = num.length() - 1; i >= 0; i--){
            sb.append(num.charAt(i));
        }

        return Integer.parseInt(sb.toString(), 3);
    }
}