package Programmers;

import java.util.*;

public class ProgrammingBasic {

    public static void main(String[] args) {

        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(solution(numbers, target));

    }

    public static int solution(int[] numbers, int target) {

        return dfs(numbers, 0, 0, target);
    }

    private static int dfs(int[] numbers, int node, int sum, int target) {
        if(node == numbers.length) {
            return sum == target ? 1 : 0;
        }

        return dfs(numbers, node + 1, sum + numbers[node], target)
                + dfs(numbers, node+1, sum - numbers[node], target);

    }
}
