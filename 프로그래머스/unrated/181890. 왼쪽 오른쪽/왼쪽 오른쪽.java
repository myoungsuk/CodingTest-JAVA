import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String[] str_list) {
        
       List<String> list = new ArrayList<>(Arrays.asList(str_list));
        boolean is = false;

        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].equals("l")){
                list = list.subList(0, i);
                is = true;
                break;
            } else if(str_list[i].equals("r")){
                list = list.subList(i + 1, list.size());
                is = true;
                break;
            }
        }

        if(!is){
            list.clear();
        }
        return list.toArray(new String[0]);
    }
}