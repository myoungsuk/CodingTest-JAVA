package ZerobaseCodingTest;


import java.util.*;

public class TEST2_3_1 {
    public static void main(String[] args) {


        solution("221123");
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int[] count = new int[10];
        List<Integer> countlist = new ArrayList<>();
        List<Integer> indexes = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            indexes.add(i);
        }

        for(int i = 0; i < s.length(); i++){
            count[Integer.parseInt(String.valueOf(s.charAt(i)))]++;
        }

        for(int i = 0; i < count.length; i++){
            countlist.add(count[i]);
        }

        indexes.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
               if(countlist.get(o1).equals(countlist.get(o2))){
                   return o1.compareTo(o2);
               }else{
                   return countlist.get(o2) - countlist.get(o1);
               }
            }
        });

        for(int i = 0; i<indexes.size(); i++){
            if(i == indexes.size()-1){
                sb.append(indexes.get(i));
            }else{
                sb.append(indexes.get(i)).append(" ");
            }
        }
        System.out.println(sb);
        return sb.toString();
    }
}