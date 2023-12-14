package Programmers;

import java.util.*;

public class ProgrammingBasic {

    public static void main(String[] args) {

        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        System.out.println(solution(scoville, K));

    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int value : scoville){
            pq.add(value);
        }

        while(pq.peek() < K){
            if(pq.size() < 2){
                return -1;
            }
            int first = pq.poll();
            int second = pq.poll();

            pq.add(first + second * 2);
            answer++;
        }

        return answer;
    }
}
