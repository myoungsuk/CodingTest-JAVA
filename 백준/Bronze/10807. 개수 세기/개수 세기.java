import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int[] numlist = new int[N];

       for(int i = 0; i < numlist.length; i++){
           numlist[i] = sc.nextInt();
       }

       int v = sc.nextInt();
       int count = 0;
       for(int i = 0; i < numlist.length; i++){
           if(numlist[i] == v){
               count++;
           }
       }
        System.out.println(count);
    }
}
