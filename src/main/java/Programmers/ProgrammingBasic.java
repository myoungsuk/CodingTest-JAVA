package Programmers;


public class ProgrammingBasic {
    public static void main(String[] args) {
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        solution("rermgorpsam", queries);
    }

    public static String solution(String my_string, int[][] queries) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int startcount = start;
            int end = queries[i][1];
            int endcount = end;

            for (int j = 0; j < (endcount - startcount) / 2 + 1; j++) {
                char temp = sb.charAt(start);
                sb.setCharAt(start, sb.charAt(end));
                sb.setCharAt(end, temp);
                answer = sb.toString();
                start++;
                end--;
            }
        }
        return answer;
    }


}

