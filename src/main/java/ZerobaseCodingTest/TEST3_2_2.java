package ZerobaseCodingTest;

import java.util.*;

public class TEST3_2_2 {
    public static void main(String[] args) {

        int[] arr1 = {1, 3, 6, 9, 12};
        int[] arr2 = {2, 4, 6, 8, 10, 12};
        solution(arr1 , arr2);

    }

    public static List<Integer> solution(int[] arr1, int[] arr2) {
        //arr1 arr2 중복된느 원소 존재 없음
        //교집합 구하는 프로그램
        List<Integer> arr1list = new ArrayList<>();
        List<Integer> arr2list = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < arr1.length; i++){
            arr1list.add(arr1[i]);
        }
        for(int i = 0; i < arr2.length; i++){
            arr2list.add(arr2[i]);
        }


        for(int i = 0; i < arr2list.size(); i++){
            if(arr1list.contains(arr2list.get(i))){
                answer.add(arr2list.get(i));
            }
        }
        Collections.sort(answer);
        return answer;
    }
}