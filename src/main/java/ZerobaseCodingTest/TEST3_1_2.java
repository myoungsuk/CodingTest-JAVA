package ZerobaseCodingTest;

import java.util.*;

public class TEST3_1_2 {
    public static void main(String[] args) {

        int[] arr = {100, 95, 95, 95, 90};
        solution(arr);

    }

    public static int solution(int[] arr) {
        //A학점을 받을 수 있는 학생의 한계는 50%
        //그러므로 배열 50프로의 경게는 arr.length/2
        // 하지만 50프로의 경계에 있는 학생이 점수가 같은경우에는 A를 넣어줄 수 있음
        // 그런 경우에는 (arr.length/2)의 값과 (arr.length/2)+i 값들이 같은지 확인해야한다

        //arr.length/2을 이용해 값을 알아내고 +i 씩 for문을 이용해 값이 같으면 A처리를 한다
        Arrays.sort(arr);
        List<Integer> A = new ArrayList<>();

        if(arr.length % 2 == 0){
            for(int i = (arr.length)/2; i < arr.length; i++){
                A.add(arr[i]);
            }

            for(int i = arr.length/2 -1 ; i>= 0; i--){
                if(arr[i] == A.get(0)){
                    A.add(arr[i]);
                }
            }
        }else if(arr.length % 2 == 1){
            for(int i = (arr.length)/2+1; i < arr.length; i++){
                A.add(arr[i]);
            }

            for(int i = (arr.length-1)/2 ; i >= 0; i--){
                if(arr[i] == A.get(0)){
                    A.add(arr[i]);
                }
            }
        }

        return A.size();
    }
}