import java.util.*;

class Solution {
    public static int solution(String[] strArr) {
        // count 배열을 만들어 주기 위해 최대 문자 길이 확인하기

        int maxCount = 0;
        for(int i = 0; i < strArr.length; i++){
            if(strArr[i].length() > maxCount){
                maxCount = strArr[i].length();
            }
        }

        int[] count = new int[maxCount+1];

        for(int i = 0; i < strArr.length; i++){
            count[strArr[i].length()]++;
        }

        Arrays.sort(count);

        return count[maxCount];
    }
}