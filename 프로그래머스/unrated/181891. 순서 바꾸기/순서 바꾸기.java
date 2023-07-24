import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<Integer> solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < num_list.length; i++){
            if(n != num_list.length) {
                list.add(num_list[n]);
            }else{
                n = 0;
                list.add(num_list[n]);
            }
            n++;
        }
        return list;
    }
}