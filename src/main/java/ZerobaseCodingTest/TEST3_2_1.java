package ZerobaseCodingTest;

public class TEST3_2_1 {
    public static void main(String[] args) {

        String s = "134246";
        int n = 4;
        solution(s , n);

    }

    public static int solution(String s, int n) {
        //문자열 s와 정수 n
        //문자열 s에 등장하는 숫자 n의 수를 출력하는 프로그램
        int count = 0;
        char intN = Character.forDigit(n, 10);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == intN){
                count++;
            }
        }
        System.out.println(count);

        return count;
    }
}