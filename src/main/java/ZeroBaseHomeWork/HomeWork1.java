package ZeroBaseHomeWork;

public class HomeWork1 {
    public static void main(String[] args){

        /**
         *
         *  강명석
         *
         */

        System.out.println("[구구단 출력]");
        for(int i = 1; i <= 9; i++){

            for(int j = 1; j <= 9; j++){
                System.out.printf(i + " x " + j + " = " + String.format("%2d" , i * j));
                System.out.printf("    ");
            }
            System.out.println();
        }
    }
}
