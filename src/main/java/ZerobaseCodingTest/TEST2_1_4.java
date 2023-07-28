package ZerobaseCodingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TEST2_1_4 {
    public static void main(String[] args) {


        String s = "Hello world Nice world";
        solution(s);
    }

    public static int solution(String s) {
        String[] str;
        str = s.split(" ");
        List<String> list = new ArrayList<>(Arrays.asList(str));

        for(int i = 0; i < list.size(); i++){
            for(int j = i+1; j < list.size(); j++){
                if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                }
            }
        }
        return list.size();
    }
}