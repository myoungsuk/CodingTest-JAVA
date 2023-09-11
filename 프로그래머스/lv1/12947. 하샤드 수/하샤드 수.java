class Solution {
    public boolean solution(int x) {
        String x_str = String.valueOf(x);
        int sum = 0;

        for(int i = 0; i < x_str.length(); i++){
            int a = x_str.charAt(i) - '0';
            sum += a;
        }

        if(x % sum == 0){
            return true;
        }else{
            return false;
        }
    }
}