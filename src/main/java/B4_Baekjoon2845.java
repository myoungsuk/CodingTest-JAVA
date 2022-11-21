import java.lang.reflect.Array;
import java.util.Scanner;

public class B4_Baekjoon2845 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int L =  in.nextInt();
        int P =  in.nextInt();


        int result = L * P;

        for(int i = 0; i < 5; i++) {

            int N = in.nextInt();
            System.out.print(N- result + " ");
        }

        in.close();
    }
}
