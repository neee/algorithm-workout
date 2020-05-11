package ru.serdyuk.tester.task.fib;

import java.math.BigInteger;
import java.util.List;

import ru.serdyuk.tester.task.Task;

public class FibMatrixTask implements Task {

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
        BigInteger[][] res = {{BigInteger.ONE, BigInteger.ZERO},{BigInteger.ONE, BigInteger.ZERO}};
        BigInteger[][] base =  {{BigInteger.ONE, BigInteger.ONE},{BigInteger.ONE, BigInteger.ZERO}};
        while (v > 1) {
            if ((v & 1) == 1) {
                res = matrixMultiplier(res, base);
            }
            base = matrixMultiplier(base, base);
            v >>= 1;
        }
        return matrixMultiplier(res, base)[1][1];
    }

    public static BigInteger[][] matrixMultiplier(BigInteger[][] first, BigInteger[][] second) {
        BigInteger[][] result = new BigInteger[2][2];
        result[0][0] = first[0][0].multiply(second[0][0]).add(first[0][1].multiply(second[1][0]));
        result[0][1] = first[0][0].multiply(second[0][1]).add(first[0][1].multiply(second[1][1]));
        result[1][0] = first[1][0].multiply(second[0][0]).add(first[1][1].multiply(second[1][0]));
        result[1][1] = first[1][0].multiply(second[0][1]).add(first[1][1].multiply(second[1][1]));
        return result;
    }
}
