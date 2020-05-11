package ru.serdyuk.tester.task.pow;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.List;

import ru.serdyuk.tester.task.Task;

public class FastPowerDivPowerTask implements Task {

    @Override
    public Object run(List<String> data) {
        return power(new BigDecimal(data.get(0)), new BigInteger(data.get(1)));
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
