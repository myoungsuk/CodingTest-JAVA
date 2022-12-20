package B4_Baekjoon;

import java.util.Scanner;

public class B4_Baekjoon11365 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while(true){

            String str = in.nextLine();

            if("END".equals(str)){
                break;
            }

            System.out.println(new StringBuffer(str).reverse().toString());
        }

        in.close();
    }
}
