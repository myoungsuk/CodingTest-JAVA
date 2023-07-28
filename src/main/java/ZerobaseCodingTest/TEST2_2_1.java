package ZerobaseCodingTest;

public class TEST2_2_1 {
    public static void main(String[] args) {

        int[] usageArr = {1, 3, 5};
        int fee = 5;
        solution(usageArr, fee);
    }

    public static int solution(int[] usageArr, int fee) {
        int usagesum = 0;
        for(int i = 0; i < usageArr.length; i++){
            usagesum += usageArr[i];
        }

        return usagesum * fee;
    }
}