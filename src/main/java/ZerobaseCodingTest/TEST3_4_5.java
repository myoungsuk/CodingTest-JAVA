package ZerobaseCodingTest;

public class TEST3_4_5 {
    public static void main(String[] args) {

        int[] bridge = {1, 0, 1, 0, 0, 1};
        solution(bridge, 2);

    }

    public static boolean solution(int[] bridge, int jumpSize) {
        //연속된 최대 0의 값이랑
        // jumSize 의 값중에
        // jumpSize < 연속된 최대 0의 값 이면 false else true

        int count = 0;
        int max_count = 0;

        for(int i = 0; i < bridge.length; i++){
            if(count > max_count){
                max_count = count;
            }
            if(bridge[i] == 0){
                count++;
            }else if(bridge[i] == 1){
                count = 0;
            }
        }
        if(jumpSize < max_count){
            return false;
        }else{
            return true;
        }
    }
}