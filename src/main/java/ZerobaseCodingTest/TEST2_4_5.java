package ZerobaseCodingTest;



public class TEST2_4_5 {
    public static void main(String[] args) {

        String[] array = {"n", "nav", "nev"};
        solution(array, "naver");

    }

    public static int solution(String[] array, String s) {
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(s.startsWith(array[i])){
                count++;
            }
        }
        return count;
    }
}