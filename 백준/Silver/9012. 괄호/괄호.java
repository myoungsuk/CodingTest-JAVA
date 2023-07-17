import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        String[] VPS = new String[T];
        for(int i = 0; i < T; i++){
            VPS[i] = sc.next();
        }


        for(int i = 0; i < T; i++){
            int count = 0;
            for(int j = 0; j < VPS[i].length(); j++) {
                    if (VPS[i].charAt(j) == '(') {
                        count++;
                    } else if(VPS[i].charAt(j) == ')'){
                        count--;
                        if(count < 0){
                            break;
                        }
                    }
            }
            if(count == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
