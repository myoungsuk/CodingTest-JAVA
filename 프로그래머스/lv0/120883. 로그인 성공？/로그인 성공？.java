import java.util.*;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        for (String[] row : db) {
            if (Arrays.equals(row, id_pw)) {
                return "login";
            }
        }

        for (String[] row : db) {
            if (row[0].equals(id_pw[0])) {
                return "wrong pw";
            }
        }

        return "fail";
    }
}