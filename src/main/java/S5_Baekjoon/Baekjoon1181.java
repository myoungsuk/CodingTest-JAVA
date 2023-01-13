package S5_Baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Baekjoon1181 {
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] arr = new String[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.next();
        }


        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                } else {
                    return s1.length() - s2.length();
                }
            }
        });

        for(int i = 0; i < N; i++){
            if(!arr[i].equals(arr[i-1])) {
                System.out.println(arr[i]);
            }
        }
    }
}
