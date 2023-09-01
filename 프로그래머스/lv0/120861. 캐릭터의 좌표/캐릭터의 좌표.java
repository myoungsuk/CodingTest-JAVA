class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;

        for (int i = 0; i < keyinput.length; i++) {
            int newX = answer[0];
            int newY = answer[1];
            if (keyinput[i].equals("left")) {
                newX -= 1;
            } else if (keyinput[i].equals("right")) {
                newX += 1;
            } else if (keyinput[i].equals("up")) {
                newY += 1;
            } else if (keyinput[i].equals("down")) {
                newY -= 1;
            }

            if (newX >= -maxX && newX <= maxX && newY >= -maxY && newY <= maxY) {
                answer[0] = newX;
                answer[1] = newY;
            }
        }
        return answer;
    }
}