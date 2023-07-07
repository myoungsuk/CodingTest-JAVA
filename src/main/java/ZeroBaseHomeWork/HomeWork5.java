package ZeroBaseHomeWork;

import java.util.Calendar;
import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        /*
        강명석
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("[달력 출력 프로그램]");

        System.out.print("달력의 년도를 입력해 주세요.(yyyy):");
        int year = sc.nextInt();

        System.out.print("달력의 월을 입력해 주세요.(mm):");
        int month = sc.nextInt();
        String formatMonth = String.format("%02d", month);

        for (int i = 0; i < 2; i++) {
            System.out.println();
        }

        System.out.println("[" + year + "년 " + formatMonth + "월]");
        System.out.println("일   월    화   수    목   금   토");

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);

        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int lastDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);


        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("     ");

        }

        for (int day = 1; day <= lastDayOfMonth; day++) {
            System.out.printf("%02d   ", day);

            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                System.out.println();
            }
            calendar.add(Calendar.DAY_OF_WEEK,1);

        }
    }
}
