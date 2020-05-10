package ru.serdyuk.tester.task;

import java.math.BigInteger;
import java.util.List;

public class GCDBinaryTask implements Task {

    @Override
    public String run(List<String> data) {
        var value1 = new BigInteger(data.get(0));
        var value2 = new BigInteger(data.get(1));
        return "" + gcdBinary(value1, value2);
    }

    public static BigInteger gcdBinary(BigInteger a, BigInteger b) {
        BigInteger multiplier = BigInteger.ONE;
        while (a.compareTo(b) != 0) {
            if ((a.and(BigInteger.ONE)).compareTo(BigInteger.ZERO) == 0 && (b.and(BigInteger.ONE)).compareTo(BigInteger.ZERO) == 0) {
                a = a.shiftRight(1);
                b = b.shiftRight(1);
                multiplier = multiplier.shiftLeft(1);
            } else if ((a.and(BigInteger.ONE)).compareTo(BigInteger.ZERO) == 0) {
                a = a.shiftRight(1);
            } else if ((b.and(BigInteger.ONE)).compareTo(BigInteger.ZERO) == 0) {
                b = b.shiftRight(1);
            } else if (a.compareTo(b) > 0) {
                a = a.subtract(b);
            } else if (b.compareTo(a) > 0) {
                b = b.subtract(a);
            }
        }
        return multiplier.multiply(a);
    }
}
