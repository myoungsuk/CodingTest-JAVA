package CodingTest_1week;

public class TEST1 {
    public static void main(String[] args) {

        solution(15);

    }

    public static int solution(int n) {
        int count = 0;

        if(n >= 2){
            count++;
        }
        for(int i = 3; i < n; i++){
            boolean check = true;
            int j = i-1;
            while(j > 1){
                if(i % j == 0){
                    check = false;
                    break;
                }
                j--;
            }
           if(check){
               count++;
           }
        }

        return count;
    }

}
