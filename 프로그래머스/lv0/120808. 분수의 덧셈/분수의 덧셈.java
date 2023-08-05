class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int a = numer1 * denom2 + denom1 * numer2;
        int b = denom1 * denom2;
        
        int gcd = gcd(a, b);
        a /= gcd;
        b /= gcd;
        
        return new int[] {a, b};
    }
    
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }else{
            return gcd(b, a % b);
        }
    }
}