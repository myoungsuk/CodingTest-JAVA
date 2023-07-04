package Programmers;

public class FoodFight {
    public static void main(String[] args) {

        int[] food = {1, 3, 4, 6};

        solution(food);
        System.out.println(solution(food));
    }


    private static String solution(int[] food) {
        String answer = "";
        String plus = "";

        for(int i = 1; i < food.length; i++){
            for(int j = 0; j < food[i]/2 ;  j++){
                answer += Integer.toString(i);
            }
        }

        for(int i = answer.length() -1 ; i > 0 ; i--){
            plus += answer.charAt(i);
        }

        return answer + "0" + plus;
    }

}
