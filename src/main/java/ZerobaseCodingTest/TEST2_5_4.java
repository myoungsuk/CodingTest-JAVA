package ZerobaseCodingTest;

import java.math.BigInteger;

public class TEST2_5_4 {
    public static void main(String[] args) {

        solution(5);

    }

    public static BigInteger solution(int n) {
        BigInteger two = new BigInteger("2");
        BigInteger mod = new BigInteger("1000000007");
        BigInteger one = new BigInteger("1");
        BigInteger answer = two.pow(n).mod(mod).subtract(one);
        return answer;
    }
}