package ru.serdyuk.tester.task.gcd;

import java.math.BigInteger;
import java.util.List;

import ru.serdyuk.tester.task.Task;

public class GCDModuloTask implements Task {

    @Override
    public Object run(List<String> data) {
        var value1 = new BigInteger(data.get(0));
        var value2 = new BigInteger(data.get(1));
        return "" + gcdModulo(value1, value2);
    }

    public static BigInteger gcdModulo(BigInteger a, BigInteger b) {
        while (a.compareTo(BigInteger.ZERO) != 0 && b.compareTo(BigInteger.ZERO) != 0) {
            if (a.compareTo(b) > 0) {
                a = a.remainder(b);
            } else {
                b = b.remainder(a);
            }
        }
        return a.add(b);
    }
}
