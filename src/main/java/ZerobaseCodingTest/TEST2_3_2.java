package ZerobaseCodingTest;


import java.util.*;

public class TEST2_3_2 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 6, 6, 6};
        solution(nums);
    }

    public static List<Integer> solution(int[] nums) {
        List<Integer> index = new ArrayList<>();
        List<Integer> numslist = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();

        for(int i = 0;  i < nums.length; i++){
            numslist.add(nums[i]); //nums 리스트로 변환
            index.add(i+1); //인덱스 값 배열 생성
        }

        for(int i = 0; i < numslist.size(); i++){
           if(numslist.contains(index.get(i))){
               continue;
           }else{
               answer.add(i+1);
           }
        }

        System.out.println(answer);
        return answer;
    }
}