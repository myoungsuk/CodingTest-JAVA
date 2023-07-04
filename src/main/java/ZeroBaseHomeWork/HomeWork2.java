package ZeroBaseHomeWork;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {

        /*
         *  강명석
         */

        int cashback = 0;

        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해 주시요.(금액):");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();

        cashback = money / 10;

        if(cashback >= 300){
            cashback = 300;
        }else if( 100 <= cashback && cashback < 200){
            cashback = 100;
        }else if (200 <= cashback && cashback <300){
            cashback = 200;
        }

        System.out.println("결제 금액은 " + money + "이고, 캐시백은 " + cashback + "원 입니다." );
    }
}
