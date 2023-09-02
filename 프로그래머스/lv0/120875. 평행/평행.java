class Solution {
    public int solution(int[][] dots) {
        int answer = 0;

        float a = (float) Math.abs(dots[0][1] - dots[1][1]) / Math.abs(dots[0][0] - dots[1][0]);
        float b = (float) Math.abs(dots[2][1] - dots[3][1]) / Math.abs(dots[2][0] - dots[3][0]);

        if (Math.abs(a - b) < 0.00001) {
            return 1;
        }

        float c = (float) Math.abs(dots[0][1] - dots[2][1]) / Math.abs(dots[0][0] - dots[2][0]);
        float d = (float) Math.abs(dots[1][1] - dots[3][1]) / Math.abs(dots[1][0] - dots[3][0]);

        if (Math.abs(c - d) < 0.00001) {
            return 1;
        }

        float e = (float) Math.abs(dots[0][1] - dots[3][1]) / Math.abs(dots[0][0] - dots[3][0]);
        float f = (float) Math.abs(dots[1][1] - dots[2][1]) / Math.abs(dots[1][0] - dots[2][0]);

        if (Math.abs(e - f) < 0.00001) {
            return 1;
        }

        return answer;
    }
}