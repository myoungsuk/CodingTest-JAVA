package ZerobaseCodingTest;

import java.util.*;

public class TEST3_4_3 {
    public static void main(String[] args) {

        int[][] city = {{1, 0, 1}, {1, 1, 1}, {1, 1, 1}};
        solution(city);

    }

    public static int[][] solution(int[][] city) {
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int h = city.length;
        int w = city[0].length;

        int[][] dist = new int[h][w];

        Queue<int[]> queue = new LinkedList<>();

        //모든 셀을 돌면서 버스 정류장 위치를 큐에 추가하고 아파트 위치의 거리를 최대값으로 설정
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                if(city[i][j] == 0){
                    queue.offer(new int[]{i, j});
                } else {
                    dist[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        //큐가 빌 때까지
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            //현재 위치에서 상하좌우 위치를 확인
            for(int[] direction : directions){
                int newX = x + direction[0];
                int newY = y + direction[1];

                //새로운 위치가 유효하고 거리가 더 짧으면 거리를 업데이트하고 큐에 추가
                if(newX >= 0 && newY >= 0 && newX < h && newY < w) {
                    if(dist[newX][newY] > dist[x][y] + 1) {
                        dist[newX][newY] = dist[x][y] + 1;
                        queue.offer(new int[]{newX, newY});
                    }
                }
            }
        }
        for(int i = 0; i < dist.length; i++){
            System.out.println(Arrays.toString(dist[i]));
        }
        return dist;
    }
}