package ZerobaseCodingTest;

import java.util.*;

public class TEST3_1_1 {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 4, 3, 1, 1};
        solution(arr);

    }

    public static boolean solution(int[] arr) {
        //이 배열에 숫자 n이 몇 개 들어 있는지 센 결과를 숫자 n의 카운트 결과
        //arr에 속한 모든 숫자의 카운트 결과가 서로 다른 숫자이면 true
        //count 결과가 하나라도 같으면 false를 출력

        //count 배열에 count[arr[i]]++; 을 해준다
        int[] count = new int[100];

        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }

        Arrays.sort(count);

        for(int i = 1; i < count.length; i++){
            if(count[i] != 0 && count[i] == count[i-1]){
                return false;
            }
        }

        return true;
    }
}