package S4_Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon1269 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Set<Integer> alist = new HashSet<>();
        Set<Integer> blist = new HashSet<>();

        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < a; i++){
            alist.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < b; i++){
            blist.add(Integer.parseInt(st.nextToken()));
        }

        Set<Integer> copy = new HashSet<>(alist);

        alist.removeAll(blist);
        blist.removeAll(copy);
        alist.addAll(blist);

        System.out.print(alist.size());

        br.close();
    }
}
