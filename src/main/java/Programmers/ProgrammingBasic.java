package Programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ProgrammingBasic {
    public static void main(String[] args) {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1,1,1,1,1,1};
        solution(progresses, speeds);
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < progresses.length; i++){
            int remain = (100 - progresses[i]); //남아있는 정도
            int remainDay = remain / speeds[i]; //100이상을 채우기 위한 날짜 수
            if(remain % speeds[i] != 0){
                remainDay += 1; // 0으로 딱 나누어 떨어지지 않으면 1을 더한다
            }
            queue.add(remainDay); //큐에 추가하기
        }

        ArrayList<Integer> answer = new ArrayList<>();

        while(!queue.isEmpty()){
            int release = queue.poll(); // queue 의 첫번째  호출
            int count = 1; //호출을 했기때문에 1부터 시작
            while(!queue.isEmpty() && queue.peek() <= release){ //peek 값이 앞전에 poll 한 값보다 작거나 같으면
                queue.poll(); //같이 poll 해준다
                count++; //횟수 더해준다
            }
            answer.add(count);
        }
        return answer.stream().mapToInt(i -> i).toArray(); //스트림을 이용한 리턴
    }
}