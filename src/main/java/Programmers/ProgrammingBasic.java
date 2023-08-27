package Programmers;

import java.util.*;

public class ProgrammingBasic {

    public static void main(String[] args) throws Exception {

        String my_str = "abc1Addfggg4556b";
        int n = 6;
        System.out.println(solution(my_str, n));
    }

    public static List<String> solution(String my_str, int n) {
        List<String> answer = new ArrayList<>();

        int i = 0;
        while(i < my_str.length()){
            if(i + n > my_str.length()){
                answer.add(my_str.substring(i));
                break;
            }else{
                answer.add(my_str.substring(i, i+n));
                i += n;
            }
        }

        return answer;
    }



}
