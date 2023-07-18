import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long answer = 0;
        int[] count = new int[21];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            for (int j = 0; j < 21; j++) {
                if ((x & (1 << j)) != 0) {
                    count[j]++; // j번째 자리에 1의 개수 넣기
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 21; j++) {
                answer += (long) count[j] * (N - count[j]) * (1 << j); //i번째 자리에 N-count[i] 는 0의개수
                count[j] = 0;
            }
        }

        System.out.println(answer);
    }
}
