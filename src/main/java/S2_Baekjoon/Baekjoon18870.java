package S2_Baekjoon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Baekjoon18870 {
    public static void main(String[] args){

        var sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] orgin = new int[N];
        int[] sorted = new int[N];
        HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();

        for(int i = 0; i < N; i++){
            sorted[i] = orgin[i] = sc.nextInt();
        }

        Arrays.sort(sorted);

        int rank = 0;
        for(int v : sorted){
            if (!rankingMap.containsKey(v)) {

                rankingMap.put(v, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int key: orgin){
            int ranking = rankingMap.get(key);
            sb.append(ranking).append(' ');
        }

        System.out.println(sb);

    }
}
