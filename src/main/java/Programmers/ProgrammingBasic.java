package Programmers;

import java.util.*;

public class ProgrammingBasic {

    public static void main(String[] args) {

        int N = 5000;

        System.out.println(solution(N));

    }

    public static int solution(int n) {
        int ans = n;
        int count = 0;

        //한 번에 K칸을 앞으로 점프, 현재까지온거리 * 2 에 해당하는 위치로 순간이동
        //순간이동은 건전지 사용량 x
        //K칸을 점프하는건 K만큼의 건전지 사용량이 듬
        //순간이동을 하는게 더 효율적
        //거리가 N만큼 떨어져 있는 곳으로 이동
        //점프를 하는건 최소화하기
        //사용하려는 건전지 사용량의 최솟값 구하기

        //2500 1250 675 점프(674) 337 점프(336) 168 84 42 21 점프(20)
        //10 5 점프(4) 2 1 점프(0)

        //홀수일 경우 1씩 증가함 1씩 증가할때마다 count++

        while(ans != 0){

            if(ans % 2 != 0) {
                ans--;
                count++;

            }else {
                ans /= 2;
            }

        }

        return count;
    }
}
