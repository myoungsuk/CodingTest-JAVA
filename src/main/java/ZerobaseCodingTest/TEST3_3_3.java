package ZerobaseCodingTest;

import java.util.*;


public class TEST3_3_3 {
    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4};
        solution(A);

    }

    public static int solution(int[] A) {
        //1, 3, 5 가 홀수인 경우 i번째 카드의 숫자와 배열값을 곱해서 점수에 더한다
        //0, 2, 4 인 경우 i번째 카드의 숫자와 배열의 -인덱스값을 곱해서 점수에 더한다
        //i는 1 부터 시작한다
        //짝수번의 값 배치는 내림차순이 되어야 되고
        //홀수번의 값 배치는 오름차순이 되면 된다
        //홀수번의 값 처리 후에 짝수번 값을 처리하면 된다

        int[] card = new int[A.length];
        Arrays.sort(A);
        int j = A.length-1;
        int k = 0;


        if(A.length % 2 == 1) {
            for (int i = A.length-1; i >= 0 ; i -= 2) {
                card[i] = A[j];
                j--;
            }
            for(int i = A.length-2; i>=1; i -= 2){
                card[i] = A[k];
                k++;
            }

            System.out.println(Arrays.toString(card));
        }else{
            for (int i = A.length-2; i >= 0 ; i -= 2) {
                card[i] = A[j];
                j--;
            }
            for(int i = A.length-1; i>=1; i -= 2){
                card[i] = A[k];
                k++;
            }
            System.out.println(Arrays.toString(card));
        }

        int sum = card[0];
        for(int i = 0; i < card.length; i++){
            System.out.println(sum);
            if(i % 2 == 0 && i != 0){
                sum += card[i] * (i+1);
            }else if(i % 2 == 1) {
                sum += card[i] * (-i-1);
            }
        }

        return sum;
    }
}