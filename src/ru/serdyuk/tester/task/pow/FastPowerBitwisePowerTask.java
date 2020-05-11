package ru.serdyuk.tester.task.pow;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import ru.serdyuk.tester.task.Task;

public class FastPowerBitwisePowerTask implements Task {

    @Override
    public Object run(List<String> data) {
        return power(new BigDecimal(data.get(0)), new BigInteger(data.get(1)));
    }

    public static BigDecimal power(BigDecimal num, BigInteger pow) {
        var res = BigDecimal.ONE;
        String bits = pow.toString(2);
        for (int i = bits.length() - 1; i >= 0; i--) {
            char bit = bits.charAt(i);
            if (bit == '1') {
                res = res.multiply(num);
            }
            num = num.multiply(num);
        }
        return res;
    }
}
