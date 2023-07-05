package ZeroBaseHomeWork;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {

        /*
         *  강명석
         */
        int min = 10000;
        int[] pay = new int[3];
        for(int i = 0; i < pay.length ; i++){
            pay[i] = 10000;
        }

        System.out.println("[입장권 계산]");
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력해주세요.(숫자):");
        int age = sc.nextInt();
        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        int entertime = sc.nextInt();
        System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
        String merit = sc.next();
        System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
        String card = sc.next();


        if(age < 3){
            pay[0] = 0;
        }else if(merit.equals("y") || card.equals("y")){
            pay[1] = 8000;
        }else if(age >= 3 && age < 13 ){
            pay[2] = 4000;
        }else if(entertime >= 17 && entertime < 24){
            pay[3] = 4000;
        }

        for(int i = 0; i < pay.length; i++){
             if(min >= pay[i]){
                 min = pay[i];
             }
        }
        System.out.println("입장료: " + min);
    }
}
