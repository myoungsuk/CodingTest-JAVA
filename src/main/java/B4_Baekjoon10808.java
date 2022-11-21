import java.util.Scanner;

public class B4_Baekjoon10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] arr = new int[26];

        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i) -97]++;
        }
        for(int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
