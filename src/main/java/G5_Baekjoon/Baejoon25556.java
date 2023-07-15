package G5_Baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Baejoon25556 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < n; i++){
            numbers.add(Integer.parseInt(sc.next()));
        }

        List<Stack<Integer>> stacks = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            Stack<Integer> stack = new Stack<>();
            stack.push(0);
            stacks.add(stack);
        }

        outer:
        for(int i = 0; i < numbers.size(); i++){
            for(int j = 0; j < stacks.size(); j++){
                if(numbers.get(i) > stacks.get(j).peek()){
                    stacks.get(j).push(numbers.get(i));
                    continue outer;
                }
            }
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }
}
