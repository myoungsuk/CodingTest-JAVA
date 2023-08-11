package CodingTest_1week;

public class TEST4 {
    public static void main(String[] args) {

        solution(4, 1, 3);
    }

    public static int solution(int n, int i, int j) {

        int value = 1;
        for (int layer = n - 1; layer >= 0; layer--) {
            if (i < layer && j >= layer) {
                value += 1;
            } else if (i < layer && j < layer) {
                value += 3;
            } else if (i >= layer && j < layer) {
                value += 2;
            }
            if (layer == 0) {
                break;
            }
            if (i >= layer) {
                i -= layer;
            }
            if (j >= layer) {
                j -= layer;
            }
        }
        System.out.println(value);
        return value;
    }


}
