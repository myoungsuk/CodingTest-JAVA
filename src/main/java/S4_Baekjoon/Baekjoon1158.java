package S4_Baekjoon;

import java.util.LinkedList;
import java.util.Scanner;

public class Baekjoon1158 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 1; i <= N; i++){
            list.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int count = 0;
        while(!list.isEmpty()){
            count = (count + K -1) % list.size();
            sb.append(list.remove(count)).append(", ");
        }

        sb.replace(sb.length()-2, sb.length(), ">");
        System.out.println(sb);


    }

}
