package B3_Baekjoon;

import java.util.Scanner;

public class B3_Baekjoon2857 {
    public static void main(String[] args){
       var scan = new Scanner(System.in);
       String str[] = new String[5];
       int count = 0;

       for(int i = 0; i < str.length; i++){
           str[i] = scan.next();
       }
       scan.close();
       for(int i = 0; i < str.length; i++){
           if(str[i].contains("FBI")){
               System.out.print(i+1 + " ");
               count++;
           }
       }
       if(count == 0){
           System.out.print("HE GOT AWAY");
       }


    }
}
