package ZeroBaseHomeWork;

import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        /*
        강명석
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("[과세금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요.:");
        long fee = sc.nextLong();

        tax(fee);




    }

    public static long tax(long fee) {
        long result = 0;
        long tax = 0;
        long tax6 = 720000;
        long tax15 = 5100000;
        long tax24 = 10080000;
        long tax35 = 21700000;
        long tax38 = 57000000;
        long tax40 = 120000000;
        long tax42 = 420000000;

        if (fee > 1000000000) {
            //45%
            tax = (fee - 1000000000) * 40 / 100;
            System.out.println("   12000000 *  6% = 720000");
            System.out.println("   34000000 * 15% = 5100000");
            System.out.println("   42000000 * 24% = 10080000");
            System.out.println("   62000000 * 35% = 21700000");
            System.out.println("   150000000 * 38% = 57000000");
            System.out.println("   300000000 * 40% = 120000000");
            System.out.println("   500000000 * 42% = 420000000");
            System.out.println("   " + (fee - 1000000000) + " * 45% = " + tax);
            result = 720000 + 5100000 + 10080000 + 21700000 + 57000000 + 120000000 +  420000000 + tax;
        }
        if (fee > 500000000 && fee <= 1000000000) {
            //42%
            tax = (fee - 500000000) * 40 / 100;
            System.out.println("   12000000 *  6% = 720000");
            System.out.println("   34000000 * 15% = 5100000");
            System.out.println("   42000000 * 24% = 10080000");
            System.out.println("   62000000 * 35% = 21700000");
            System.out.println("   150000000 * 38% = 57000000");
            System.out.println("   300000000 * 40% = 120000000");
            System.out.println("   " + (fee - 500000000) + " * 42% = " + tax);
            result = 720000 + 5100000 + 10080000 + 21700000 + 57000000 + 120000000 + tax;
        }
        if (fee > 300000000 && fee <= 500000000) {
            //40%
            tax = (fee - 300000000) * 40 / 100;
            System.out.println("   12000000 *  6% = 720000");
            System.out.println("   34000000 * 15% = 5100000");
            System.out.println("   42000000 * 24% = 10080000");
            System.out.println("   62000000 * 35% = 21700000");
            System.out.println("   150000000 * 38% = 57000000");
            System.out.println("   " + (fee - 300000000) + " * 40% = " + tax);
            result = 720000 + 5100000 + 10080000 + 21700000 + 57000000 + tax;
        }
        if (fee > 150000000 && fee <= 300000000) {
            //38%
            tax = (fee - 150000000) * 38 / 100;
            System.out.println("   12000000 *  6% = 720000");
            System.out.println("   34000000 * 15% = 5100000");
            System.out.println("   42000000 * 24% = 10080000");
            System.out.println("   62000000 * 35% = 21700000");
            System.out.println("   " + (fee - 150000000) + " * 38% = " + tax);
            result = 720000 + 5100000 + 10080000 + 21700000 + tax;
        }
        if (fee > 88000000 && fee <= 150000000) {
            //35%
            tax = (fee - 88000000) * 35 / 100;
            System.out.println("   12000000 *  6% = 720000");
            System.out.println("   34000000 * 15% = 5100000");
            System.out.println("   42000000 * 24% = 10080000");
            System.out.println("   " + (fee - 88000000) + "  * 35% = " + tax);
            result = 720000 + 5100000 + 10080000 + tax;
        }
        if (fee > 46000000 && fee <= 88000000) {
            tax = (fee - 46000000) * 24 / 100;
            System.out.println("   12000000 *  6% = 720000");
            System.out.println("   34000000 * 15% = 5100000");
            System.out.println("   " + (fee - 46000000) + "  * 24% = " + tax);
            result = 720000 + 5100000 + tax;
        }
        if (fee <= 46000000 && fee > 12000000) {
            tax = (fee - 12000000) * 15 / 100;
            System.out.println("   12000000 *  6% = 720000");
            System.out.println("   " + (fee - 12000000) + " * 15% = " + tax);
            result = 720000 + tax;

        }
        if (fee <= 12000000) {
            tax = fee * 6 / 100;
            System.out.println("   " + fee + " *  6% = " + tax);
            result = tax;
        }
        System.out.println();
        System.out.println("[세율에 의한 세금]:          " + result);
        System.out.println("[누진공제 계산에 의한 세금]:   " + result);

        return tax;
    }
}
