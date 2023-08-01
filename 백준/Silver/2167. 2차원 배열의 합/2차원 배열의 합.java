import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] vec = new int[N][M];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                vec[i][j] = sc.nextInt();
            }
        }

        int K = sc.nextInt();
        int i,j,x,y;
        for(int s = 0; s < K; s++){
            i = sc.nextInt() - 1;
            j = sc.nextInt() - 1;
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
            int answer = 0;
            
            for(int f = i; f <= x; f++){
                for(int a = j; a <= y;  a++){
                     answer += vec[f][a];
                }
            }
            System.out.println(answer);
        }
    }
}
