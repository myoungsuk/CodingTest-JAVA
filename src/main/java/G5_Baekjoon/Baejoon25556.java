package G5_Baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Baejoon25556 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //입력 받기
        int n = sc.nextInt(); // 순열의 길이 입력
        List<Integer> numbers = new ArrayList<>(); //순열을 저장할 ArrayList 생성

        for (int i = 0; i < n; i++) {
            numbers.add(Integer.parseInt(sc.next())); //순열의 각 요소 입력받기
        }

        List<Stack<Integer>> stacks = new ArrayList<>(); //4개의 스택을 저장할 스택리스트
        for (int i = 0; i < 4; i++) {
            Stack<Integer> stack = new Stack<>(); //각 스택 생성
            stack.push(0); //초기값 0 설정
            stacks.add(stack); //ArrayList에 스택 추가
        }

        outer: // 라벨을 지정해서 특정 루프를 나갈 수 있게 한다
        for (int i = 0; i < numbers.size(); i++) { //순열의 개수만큼 반복
            for (int j = 0; j < stacks.size(); j++) { //4개의 스택에 각 스택마다
                if (numbers.get(i) > stacks.get(j).peek()) { //현재 숫자가 스택의 가장 위 숫자보다 크면
                    stacks.get(j).push(numbers.get(i)); // 스택에 현재 숫자를 넣는다
                    continue outer; //다음 숫자로 이동
                }
            }
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }
}
