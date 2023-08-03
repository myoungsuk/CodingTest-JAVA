package ZerobaseCodingTest;

import java.util.Arrays;

public class TEST3_2_3 {
    public static void main(String[] args) {

        int[] arr = {1, 3, 0, 7, 9};
        String prefix = "<";
        String searator = ", ";
        String postfix = ">";

        solution(arr , prefix, searator, postfix);

    }

    public static String solution(int[] arr, String prefix, String separator, String postfix) {
        //1. 문자열은 prefix 값으로 시작
        //2. 문자열의 arr의 요소들은 separator로 구분하여 순서대로 출력
        //3. 문자열은 postfix 값으로 종료

        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        for(int i = 0; i < arr.length; i++){
            sb.append(arr[i]);
            if(i != arr.length -1){
                sb.append(separator);
            }

        }
        sb.append(postfix);
        
        return sb.toString();
    }
}