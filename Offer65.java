package leccod;

import java.math.BigInteger;

public class Offer65 {
    public static void main(String[] args) {

    }

    public int add(int a, int b) {
        BigInteger bigIntegera = new BigInteger(String.valueOf(a));
        BigInteger bigIntegerb = new BigInteger(String.valueOf(b));
        bigIntegera.add(bigIntegerb);
        return bigIntegera.intValue();
    }
}
