package ZerobaseCodingTest;

public class TEST3_5_2 {
    public static void main(String[] args) {

        solution(-278, 3);

    }

    public static int solution(int N, int K) {
        StringBuilder sb = new StringBuilder();

        String NN = Integer.toString(N);
        for(int i = 0; i < NN.length(); i++){
            sb.append(NN.charAt(i));
        }
        String KK = Integer.toString(K);
        int max = 0;
        int min = Integer.MIN_VALUE;
        int current = 0;

        if(N > 0){
            for(int i = 0; i < NN.length() +1; i++) {
                sb = new StringBuilder(NN);
                current = Integer.parseInt(String.valueOf(sb.insert(i, KK)));
                if (current > max) {
                    max = current;
                }
            }
        }else{
            for(int i = 1; i < NN.length()+1; i++) {
                sb = new StringBuilder(NN);
                current = Integer.parseInt(String.valueOf(sb.insert(i, KK)));
                if (current > min) {

                    min = current;

                }
            }
        }
        if(N > 0 ){
            return max;
        }else{
            return min;
        }
    }
}