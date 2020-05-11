package ru.serdyuk.tester.task.fib;

import java.util.List;

import ru.serdyuk.tester.task.Task;

public class FibRecutsionTask implements Task {

    @Override
    public Object run(List<String> data) {
        return fib(Integer.parseInt(data.get(0)));
    }

    public static long fib(long v) {
        if (v == 0) {
            return 0;
        }
        if (v == 1 || v == 2) {
            return 1;
        }
        return fib(v - 1) + fib(v - 2);
    }
}
