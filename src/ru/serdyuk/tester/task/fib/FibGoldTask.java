package ru.serdyuk.tester.task.fib;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.List;

import ru.serdyuk.tester.task.Task;

public class FibGoldTask implements Task {

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
        BigDecimal fiveSqrt = BigDecimal.valueOf(5).sqrt(MathContext.DECIMAL128);
        BigDecimal divide = (BigDecimal.ONE.add(fiveSqrt)).divide(BigDecimal.valueOf(2));
        BigDecimal power = power(divide, BigInteger.valueOf(v));
        return new BigDecimal("0.5").add(power.divide(fiveSqrt, MathContext.DECIMAL128)).toBigInteger();
    }

    public static BigDecimal power(BigDecimal num, BigInteger pow) {
        var res = BigDecimal.ONE;
        while (pow.compareTo(BigInteger.ONE) > 0) {
            if (pow.remainder(BigInteger.TWO).compareTo(BigInteger.ONE) == 0) {
                res = res.multiply(num);
            }
            num = num.multiply(num);
            pow = pow.divide(BigInteger.TWO);
        }
        if (pow.compareTo(BigInteger.ZERO) > 0) {
            res = res.multiply(num);
        }
        return res.round(MathContext.DECIMAL32);
    }
}
