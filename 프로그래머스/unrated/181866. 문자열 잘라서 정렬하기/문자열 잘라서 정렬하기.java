import java.util.*;

class Solution {
    public static List<String> solution(String myString) {
        String[] str;
        str = myString.split("x");

        List<String> list = new ArrayList<>();

        for(int i = 0; i < str.length; i++){
            if(!str[i].equals("")){
                list.add(str[i]);
            }
        }
        Collections.sort(list);
        return list;
    }
}