package ZerobaseCodingTest;

public class TEST2_4_4 {
    public static void main(String[] args) {

        int[] nums = {2, 5, 6, 3, 2, 6, 6};
        solution(nums);

    }

    public static int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1 ; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    answer++;
                }
            }
        }
        return answer;
    }
}