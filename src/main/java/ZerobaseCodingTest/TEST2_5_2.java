package ZerobaseCodingTest;

import java.util.*;
public class TEST2_5_2 {
    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 3, 2};

        solution(nums, 3);

    }

    public static int solution(int[] nums, int n) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == n){
                return i;
            }
        }
        return -1;
    }
}