package ZerobaseCodingTest;

public class TEST3_5_1 {
    public static void main(String[] args) {

        solution(15);

    }

    public static int solution(int n) {
        //1 이상 n 이하의 자연수
        //연속되어야됨
        int sum = 0;
        int i = 1;
        int start = 1;
        int count = 0;
        while (n >= i) {
            sum += i;
            i++;
            System.out.println(sum);
            if (sum == n) {
                start++;
                i = start;
                sum = 0;
                count++;
            } else if (sum > n) {
                start++;
                i = start;
                sum = 0;
            }

        }
        System.out.println(count);
        return count;

    }
}