import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        if(isPalin(S)){
            System.out.println(S.length());
        }else{
            for(int i = 0; i < S.length(); i++){
                String sub = S.substring(i);
                if(isPalin(sub)){
                    System.out.println(S.length() + i);
                    break;
                }
            }
        }
    }

    public static boolean isPalin(String S){
        for(int i = 0; i <= S.length()/2; i++){
            if(S.charAt(i) != S.charAt(S.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
