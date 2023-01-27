package S3_Baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Baekjoon11478 {
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        String s = sc.next();

        Set<String> str =new HashSet<>();

        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j <= s.length(); j++){
                if(!str.contains(s.substring(i,j))){
                    str.add(s.substring(i, j));
                }
            }
        }
        System.out.println(str.size());
    }
}
