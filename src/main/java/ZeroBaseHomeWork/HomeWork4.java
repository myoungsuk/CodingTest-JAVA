package ZeroBaseHomeWork;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args){
        /*
        강명석
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("[주민등록번호 계산]");

        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        int year = sc.nextInt();
        String Ryear = Integer.toString(year).substring(2,4);

        System.out.print("출생월을 입력해 주세요.(mm):");
        int month = sc.nextInt();
        String Rmonth = "";
        if(month < 10) {
             Rmonth = String.format("%02d", month);
        }else{
             Rmonth = Integer.toString(month);
        }

        System.out.print("출생일을 입력해 주세요.(dd):");
        int day = sc.nextInt();
        String Rday = "";
        if(day < 10) {
            Rday = String.format("%02d", day);
        }else{
            Rday = Integer.toString(day);
        }

        System.out.print("성별을 입력해 주세요.(m/f):");
        String gender = sc.next();
        String Rgender = "";
        if(gender.equals("m")){
            Rgender = "3";
        }else
        {
            Rgender = "4";
        }

        int[] randomnumbers = random(6, 10);
        String randomnumbersStr = "";
                for(int i = 0; i < randomnumbers.length; i++) {
                    randomnumbersStr += Integer.toString(randomnumbers[i]);
                }

        String frontnumber = Ryear + Rmonth + Rday;
        String backnumber = Rgender + randomnumbersStr;

        System.out.println(frontnumber + "-" + backnumber);



    }

    private static int[] random(int size, int num){
        Random random = new Random();
        int[] number = new int[size];

        for(int i = 0; i < size; i++){
            number[i] = random.nextInt(num);
        }

        return number;
    }
}
