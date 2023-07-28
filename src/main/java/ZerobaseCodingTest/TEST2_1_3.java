package ZerobaseCodingTest;

import java.util.Arrays;
import java.util.Objects;

public class TEST2_1_3 {
    public static void main(String[] args) {

        String p = "가나다라";
        String s = "바나나 나나 다다라ㅏ라 다다";
        solution(p , s);
    }

    public static boolean solution(String p, String s) {
        int[] strp = new int[4];
        int[] strs = new int[p.length()];

        for(int i = 0; i < p.length(); i++){
            strp[i] = i;
            strs[i] = i;
        }

        for(int i = 0; i < p.length(); i++){
            for(int j = i+1; j < p.length() -1; j++){
                if(p.charAt(i) == p.charAt(j)){
                    strp[j] = strp[i];
                }
            }
        }

        String[] ss;
        ss = s.split(" ");

        for(int i = 0; i < ss.length; i++){
            for(int j = i+1; j < ss.length -1; j++){
                if(Objects.equals(ss[i], ss[j])){
                    strs[j] = strs[i];
                }
            }
        }

        System.out.println(Arrays.toString(strs));
        System.out.println(Arrays.toString(strp));

        if(Arrays.equals(strp, strs)){
            return true;
        }else{
            return false;
        }
    }
}