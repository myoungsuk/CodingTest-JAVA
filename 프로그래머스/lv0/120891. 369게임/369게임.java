class Solution {
    public int solution(int order) {
        String orderStr = Integer.toString(order);
        String temp = orderStr.replaceAll("[369]", "");

        return orderStr.length() - temp.length();
    }
}