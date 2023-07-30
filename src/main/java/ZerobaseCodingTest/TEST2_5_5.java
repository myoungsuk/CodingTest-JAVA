package ZerobaseCodingTest;


public class TEST2_5_5 {
    public static void main(String[] args) {

        int[] arr = {0, 5, 10, 15};
        solution(arr);

    }

    public static String solution(int[] arr) {
       for(int i = 1; i*2 < arr.length; i++){
           if(arr[i] > arr[i*2] || (i * 2 + 1 < arr.length && arr[i] > arr[i*2+1])){
               return "NO";
           }
       }
       return "YES";
    }
}