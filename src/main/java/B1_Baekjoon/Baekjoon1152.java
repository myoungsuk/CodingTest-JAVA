package B1_Baekjoon;

import java.util.Scanner;

public class Baekjoon1152 {
    public static void main(String[] args){
        var sc = new Scanner(System.in);

        String S = sc.nextLine();
        String[] arr = S.split(" ");


        if(S.length() == 0){
            System.out.println(0);
            System.exit(0);
        }
        if(arr[0] == ""){
            System.out.println(arr.length -1);
        }else{
            System.out.println(arr.length);
        }


    }
}
