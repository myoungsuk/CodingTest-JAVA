package ZerobaseCodingTest;


public class TEST2_2_3 {
    public static void main(String[] args) {

        solution(15);
    }

    public static int solution(int n) {
        int i = 1;
        while(true){
            if(Math.pow(i, 3) < n){
                i++;
            }else{
                break;
            }
        }
        return (int) Math.pow(i-1,3);
    }
}