import java.util.Scanner;


public class B4_Baekjoon2439 {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.close();

        for (int k = 1; k <= N; k++) {
            for (int i = 1; i <= N-k; i++) {
                System.out.print(" ");
            }
            for (int j = 0; j < k ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
