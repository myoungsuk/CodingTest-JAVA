package ZerobaseCodingTest;

public class TEST3_1_5 {
    public static void main(String[] args) {

        int n = 11;
        int price = 10;
        solution(n , price);

    }

    public static int solution(int n, int price) {

        int a = n / 11;
        int b = n % 11;
        int cost = a * 10 * price;

        int answer = 0;
        if(b > 0){
            if( b <= 10) {
                answer = b * price;
            }else{
                answer = 10 * price;
            }
        }

        int result = cost + answer;
        return result;

    }
}