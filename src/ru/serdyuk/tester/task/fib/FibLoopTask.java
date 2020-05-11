package ru.serdyuk.tester.task.fib;

import java.math.BigInteger;
import java.util.List;

import ru.serdyuk.tester.task.Task;

public class FibLoopTask implements Task {

    @Override
    public Object run(List<String> data) {
        return fib(Long.parseLong(data.get(0)));
    }

    public static BigInteger fib(long v) {
        if (v == 0) {
            return BigInteger.ZERO;
        }
        if (v == 1 || v == 2) {
            return BigInteger.ONE;
        }
        var v0 = BigInteger.ONE;
        var v1 = BigInteger.ONE;
        var v2 = BigInteger.ZERO;
        for (int i = 3; i <= v; i++) {
            v2 = v0.add(v1);
            v0 = v1;
            v1 = v2;
        }
        return v2;
    }
}
