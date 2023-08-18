class Solution {
    public static int solution(int balls, int share) {
        int answer = 0;
        answer = factorial(balls, share);
        return answer;
    }

    public static int factorial(int n , int m){
        if( m == 0 || n == m){
            return 1;
        }else{
            return factorial(n -1 , m - 1) + factorial(n-1, m);
        }
    }
}