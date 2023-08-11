package CodingTest_1week;

import java.util.*;

public class TEST2 {
    public static void main(String[] args){

        String[] names = {"제로", "베이스", "자바", "스쿨", "자바", "베이스", "베이스", "백엔드", "화이팅"};
        solution(names);
    }

    public static int solution(String[] names) {
        List<String> list = new ArrayList<>();

        for(int i = 0; i < names.length; i++){
            if(!list.contains(names[i])) {
                list.add(names[i]);
            }
        }
        int n = list.size();
        int r = 4;

        int answer = factorial(n) / (factorial(r) * factorial(n-r));


        return answer;
    }

    public static int factorial(int n){
        int answer = 1;
        for(int i = 1; i <= n; i++){
            answer *= i;
        }
        return answer;
    }
}
