package ZerobaseCodingTest;


public class TEST2_5_2 {
    public static void main(String[] args) {

        String sentence = "Hello every world";
        String word = "every";

        solution(sentence, word);

    }

    public static int solution(String sentence, String word) {
        String[] words = sentence.split(" ");

        for(int i = 0; i < words.length; i++){
            if(words[i].equals(word)){
                return i;
            }
        }

        return -1;
    }
}