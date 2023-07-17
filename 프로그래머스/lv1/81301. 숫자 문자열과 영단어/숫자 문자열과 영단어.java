class Solution {
    public int solution(String s) {
        String answer = "";
        String other = "";
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                answer += s.charAt(i);
            }else{
                other += s.charAt(i);
                if(other.equals("zero")){
                    answer += "0";
                    other = "";
                }else if(other.equals("one")){
                    answer += "1";
                    other = "";
                }else if(other.equals("two")){
                    answer += "2";
                    other = "";
                }else if(other.equals("three")) {
                    answer += "3";
                    other = "";
                }else if(other.equals("four")) {
                    answer += "4";
                    other = "";
                }else if(other.equals("five")) {
                    answer += "5";
                    other = "";
                }else if(other.equals("six")) {
                    answer += "6";
                    other = "";
                }else if(other.equals("seven")) {
                    answer += "7";
                    other = "";
                }else if(other.equals("eight")) {
                    answer += "8";
                    other = "";
                }else if(other.equals("nine")) {
                    answer += "9";
                    other = "";
                }
            }
        }
        return Integer.parseInt(answer);
    }
}