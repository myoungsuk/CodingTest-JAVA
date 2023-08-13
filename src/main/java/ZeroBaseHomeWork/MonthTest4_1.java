package ZeroBaseHomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MonthTest4_1 {

    private static int dx[] = {-1, 0, 1, 0}; // 상, 우, 하, 좌
    private static int dy[] = {0, 1, 0, -1};
    private static int N;
    private static int result;

    public static void main(String[] args) {
        String[][] board = {{"X", "X", "B", "X", "X"}, {"B", "B", "B", "B", "B"}, {"X", "L", "U", "X", "X"}, {"B", "U", "B", "X", "B"}, {"X", "L", "X", "B", "X"}};
        System.out.println(solution(5, 3, board)); // 결과 출력
    }

    public static int solution(int N, int K, String[][] board) {
        result = 0;

        List<int[]> shootingPoints = new ArrayList<>();

        // 테두리 사격 위치를 shootingPoints에 추가
        for (int i = 0; i < N; i++) {
            shootingPoints.add(new int[]{0, i});
            shootingPoints.add(new int[]{i, 0});
            shootingPoints.add(new int[]{N - 1, i});
            shootingPoints.add(new int[]{i, N - 1});
        }

        dfs(0, 0, K, board, shootingPoints);

        return result;
    }

    public static void dfs(int score, int index, int remain, String[][] board, List<int[]> shootingPoints) {
        if (remain == 0) {
            result = Math.max(result, score);
            return;
        }
        if (index >= shootingPoints.size()) {
            return;
        }

        int x = shootingPoints.get(index)[0];
        int y = shootingPoints.get(index)[1];

        // 해당 사격 위치에서 모든 방향으로 사격을 진행
        for (int dir = 0; dir < 4; dir++) {
            String[][] copyBoard = copyArray(board);
            int newScore = shoot(x, y, dir, copyBoard);
            dfs(score + newScore, index + 1, remain - 1, copyBoard, shootingPoints);
        }

        dfs(score, index + 1, remain, board, shootingPoints);
    }

    public static int shoot(int x, int y, int dir, String[][] board) {
        int score = 0;
        while (true) {
            x += dx[dir];
            y += dy[dir];

            if (x < 0 || x >= N || y < 0 || y >= N) {
                break;
            }

            if (board[x][y].equals("X")) {
                break;
            }

            if (Arrays.asList("U", "R", "D", "L").contains(board[x][y])) {
                int targetDir = "URDL".indexOf(board[x][y]);
                if (dir == targetDir) {
                    score += 3;
                    board[x][y] = "B";
                    break;
                } else if ((dir + 2) % 4 == targetDir) {
                    score += 1;
                    break;
                } else {
                    score += 2;
                    board[x][y] = "URDL".charAt((targetDir + 1) % 4) + "";
                    break;
                }
            }
        }
        return score;
    }

    public static String[][] copyArray(String[][] original) {
        String[][] result = new String[N][N];
        for (int i = 0; i < N; i++) {
            System.arraycopy(original[i], 0, result[i], 0, N);
        }
        return result;
    }
}
