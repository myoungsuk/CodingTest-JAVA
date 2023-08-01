package S4_Baekjoon;
import java.util.*;

public class Baekjoon11047 {
    public static void main(String[] args){
        // 동전을 적절히 사용해서 합을 K로 만들기
        // N는 동전의 개수
        // K는 동전의 가치
        // A[i] 는 동전의 가치

        //K원을 만드는데 필요한 동전 개수의 최솟값

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        int count = 0;

        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        int i = N-1 ;
        while(K != 0){
            if(A[i] > K){
                i--;
            }else{
                count += K / A[i];
                K = K % A[i];
            }
        }
        System.out.println(count);
    }
}
