package Programmers;

public class ProgrammingBasic {
    public static void main(String[] args) {


        solution("Naver");
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(Character.isLowerCase(s.charAt(i))){
                sb.append(Character.toUpperCase(s.charAt(i)));
            }else{
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        return sb.toString();
    }
}