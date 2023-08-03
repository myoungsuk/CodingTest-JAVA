package ZerobaseCodingTest;

public class TEST3_2_4 {
    public static void main(String[] args) {

        boolean[][] matrix = {{true, true, true, true}, {true, true, false, true}, {true, false, true, true}, {true, true, true, true}};
        boolean b = true;
        solution(matrix , b);

    }

    public static boolean solution(boolean[][] matrix, boolean b) {

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                if(matrix[i][j] == b){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}