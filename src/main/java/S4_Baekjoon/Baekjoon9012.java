package S4_Baekjoon;

import java.util.Scanner;
import java.util.Stack;


public class Baekjoon9012 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] VPS = new String[T];
        for(int i = 0; i < T; i++){
            VPS[i] = sc.next();
        }

        for(int i = 0; i < T; i++){
            Stack<Character> stack = new Stack<>();
            Boolean isVPS = true;
            for(char c : VPS[i].toCharArray()){
                if(c == '('){
                    stack.push(c);
                }else if(c == ')'){
                   if(stack.isEmpty()){
                       isVPS = false;
                       break;
                   }else{
                       stack.pop();
                   }
                }
            }
            if(!stack.isEmpty()){
                isVPS = false;
            }
            if(isVPS){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
