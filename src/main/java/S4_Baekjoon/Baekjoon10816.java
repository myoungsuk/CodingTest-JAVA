package S4_Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon10816 {
    public static void main(String[] args) throws IOException {
        var sc = new Scanner(System.in);
        var sb = new StringBuilder();

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int m = sc.nextInt();

        for(int i = 0; i < m; i++){
            int target = sc.nextInt();
            sb.append(upperBound(arr , target) - lowerBound(arr, target)).append(' ');
        }
        System.out.println(sb);
    }

    public static int lowerBound(int[] arr , int target){
        int low = 0;
        int high = arr.length;

        while(low < high){
            int mid = (low + high)/2;

            if(target <= arr[mid]){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
    public static int upperBound(int[] arr, int target){
        int low = 0;
        int high = arr.length;

        while(low < high){
            int mid = (low + high)/2;

            if(target < arr[mid]){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}
