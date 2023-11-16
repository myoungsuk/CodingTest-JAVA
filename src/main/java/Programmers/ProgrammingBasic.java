package Programmers;

import java.util.*;

public class ProgrammingBasic {

    public static void main(String[] args) {

        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        System.out.println(Arrays.toString(solution(n, words)));

    }

    public static int[] solution(int n, String[] words) {

        HashSet<String> set = new HashSet<>();

        int lastPerson = 0;
        int turn = 0;
        String prevWord = "";

        for (int i = 0; i < words.length; i++) {

            String currentWord = words[i];

            if (i > 0) {
                String last = prevWord.substring(prevWord.length() - 1);
                String first = currentWord.substring(0, 1);


                if (!last.equals(first) || set.contains(currentWord)) {
                    lastPerson = (i % n) + 1;
                    turn = (i / n) + 1;
                    break;
                }
            }

            set.add(currentWord);
            prevWord = currentWord;
        }

        if (lastPerson == 0) {
            return new int[]{0, 0};
        }

        return new int[]{lastPerson, turn};
    }
}
