package Programmers;

import java.util.*;

public class ProgrammingBasic {

    public static void main(String[] args) {

        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        System.out.println(Arrays.toString(solution(n, arr1, arr2)));

    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};

        String[] binaryArr1 = new String[arr1.length];
        String[] binaryArr2 = new String[arr2.length];

        String[] binarylist1 = new String[arr1.length];
        String[] binarylist2 = new String[arr2.length];

        //일차원 배열로 풀기
        //1. 2진수로 변환
        //2. 1은 #, 0은 공백으로 변환
        //3. 두 배열을 비교하여 둘 중 하나라도 #이면 #, 둘 다 공백이면 공백으로 변환

        for (int i = 0; i < arr1.length; i++) {
            binaryArr1[i] = Integer.toBinaryString(arr1[i]);
            binaryArr2[i] = Integer.toBinaryString(arr2[i]);

            if (binaryArr1[i].length() < n) {
                for (int j = 0; j < n - binaryArr1[i].length(); j++) {
                    binaryArr1[i] = "0" + binaryArr1[i];
                }
            }

            if (binaryArr2[i].length() < n) {
                for (int j = 0; j < n - binaryArr2[i].length(); j++) {
                    System.out.println(Arrays.toString(binaryArr2));
                    binaryArr2[i] = "0" + binaryArr2[i];
                }
            }
        }

        for (int i = 0; i < binaryArr1.length; i++) {

            StringBuilder checklist = new StringBuilder();
            StringBuilder checklist2 = new StringBuilder();

            for (int j = 0; j < binaryArr1[i].length(); j++) {
                String check = String.valueOf(binaryArr1[i].charAt(j));


                if (check.equals("1")) {
                    checklist.append("#");
                } else {
                    checklist.append("0");
                }


                binarylist1[i] = String.valueOf(checklist);
            }

            for (int j = 0; j < binaryArr2[i].length(); j++) {
                String check2 = String.valueOf(binaryArr2[i].charAt(j));

                if (check2.equals("1")) {
                    checklist2.append("#");
                } else {
                    checklist2.append("0");
                }

                binarylist2[i] = String.valueOf(checklist2);
            }

        }

//        System.out.println(Arrays.toString(binaryArr1));
//        System.out.println(Arrays.toString(binaryArr2));
//
//        System.out.println(Arrays.toString(binarylist1));
//        System.out.println(Arrays.toString(binarylist2));

        return answer;
    }
}
