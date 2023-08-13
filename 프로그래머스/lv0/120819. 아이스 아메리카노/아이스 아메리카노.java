class Solution {
    public int[] solution(int money) {
        int count = 0;
        int rest = 0;
        count = money / 5500;
        rest = money % 5500;

        return new int[]{count, rest};
    }
}