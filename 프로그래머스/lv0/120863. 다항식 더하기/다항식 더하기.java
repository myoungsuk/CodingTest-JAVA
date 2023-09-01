import java.util.*;

class Solution {
    public static String solution(String polynomial) {
    String[] str = polynomial.split(" ");
    int coefficient = 0; // x의 계수
    int constant = 0; // 상수항

    for(int i = 0; i < str.length; i++){
        if(str[i].equals("x")){
            coefficient += 1;
        } else if(str[i].endsWith("x")){
            coefficient += Integer.parseInt(str[i].substring(0, str[i].length() - 1));
        } else if(!str[i].equals("+")){
            constant += Integer.parseInt(str[i]);
        }
    }

    StringBuilder result = new StringBuilder();
    if (coefficient == 1) {
        result.append("x");
    } else if (coefficient != 0) {
        result.append(coefficient).append("x");
    }
    if (constant != 0) {
        if (result.length() > 0) {
            result.append(" + ");
        }
        result.append(constant);
    }

    return result.toString();
}
}