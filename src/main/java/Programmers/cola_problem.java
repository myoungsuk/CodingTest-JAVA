package Programmers;

public class cola_problem {
    public static void main(String[] args) {


        solution(2, 1, 20);
        System.out.println(solution(2, 1, 20));
    }


    private static int solution(int a, int b, int n) {

        int count = 0;
        int num = n;
        while (num >= a) {
            count += num / a * b;
            num = num / a * b + num % a;
        }

        return count;



    }

}
