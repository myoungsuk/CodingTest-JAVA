package ZerobaseCodingTest;

public class TEST3_1_4 {
    public static void main(String[] args) {

        String s = "111000010100";
        solution(s);
    }

    public static String solution(String s) {
        int a = 0;
        int length = 0;
        int blank = 0;
        boolean Acheck = false;

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '1') {
                if (!Acheck) {
                    Acheck = true;
                    a++;
                    if (blank < 2 && a > 2) {
                        return "YES";
                    }
                }
                length++;
                if (length > 3) {
                    return "NO";
                }
                blank = 0;
            } else {
                if (Acheck) {
                    Acheck = false;
                    length = 0;
                }
                blank++;
            }
        }

        if (a > 2) {
            return "NO";
        } else {
            return "YES";
        }
    }
}
