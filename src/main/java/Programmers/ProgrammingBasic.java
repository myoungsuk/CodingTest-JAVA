package Programmers;

import java.util.*;

public class ProgrammingBasic {

    public static void main(String[] args) {

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        System.out.println((solution(participant, completion)));

    }

    public static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        for(String player : participant){
            hashMap.put(player, hashMap.getOrDefault(player,0) + 1);
        }

        for(String player : completion) {
            hashMap.put(player, hashMap.get(player) - 1);
        }

        for(String key : hashMap.keySet()){
            if(hashMap.get(key) != 0){
                return key;
            }
        }

        return null;

    }
}
