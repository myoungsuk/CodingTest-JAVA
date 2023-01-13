package B5_Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;

public class Baejoon2751 {
    public static void main(String[] args) throws IOException {
        {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            int N = Integer.parseInt(br.readLine());

            // list 계열 중 하나를 쓰면 된다.
            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                list.add(Integer.parseInt(br.readLine()));
            }

            Collections.sort(list);

            for (int value : list) {
                sb.append(value).append('\n');
            }
            System.out.println(sb);
        }
    }
}
