class Solution {
    public int[] solution(int start, int end) {
        int[] str = new int[start - end +1];
        int count = 0;
        for(int i = start; i >= end; i--){
            str[count] = i;
            count++;

        }
        return str;
    }
}