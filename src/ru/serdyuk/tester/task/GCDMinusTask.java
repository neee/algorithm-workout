package ru.serdyuk.tester.task;

import java.math.BigInteger;
import java.util.List;

public class GCDMinusTask implements Task {

    @Override
    public String run(List<String> data) {
        var value1 = new BigInteger(data.get(0));
        var value2 = new BigInteger(data.get(1));
        return "" + gcdMinus(value1, value2);
    }

    public static BigInteger gcdMinus(BigInteger a, BigInteger b) {
        while (a.compareTo(b) != 0) {
            if (a.compareTo(b) > 0) {
                a = a.subtract(b);
            } else {
                b = b.subtract(a);
            }
        }
        return a;
    }
}
