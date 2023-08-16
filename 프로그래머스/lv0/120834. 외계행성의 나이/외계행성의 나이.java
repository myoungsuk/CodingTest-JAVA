class Solution {
    public static String solution(int age) {
        String strAge = Integer.toString(age);
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < strAge.length(); i++){
            int num = strAge.charAt(i) - '0';
            char ch = (char) (num + 'a');
            sb.append(ch);
        }
        
        return sb.toString();
    }
}