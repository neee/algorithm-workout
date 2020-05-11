package ru.serdyuk.tester;

import ru.serdyuk.tester.task.fib.FibGoldTask;
import ru.serdyuk.tester.task.fib.FibLoopTask;
import ru.serdyuk.tester.task.fib.FibMatrixTask;
import ru.serdyuk.tester.task.fib.FibRecutsionTask;

public class FibTester {

    public static void main(String[] args) {
        Tester tester1 = new Tester(new FibRecutsionTask(), "resources/4.Fibo");
        tester1.runTests();

        Tester tester2 = new Tester(new FibLoopTask(), "resources/4.Fibo");
        tester2.runTests();

        Tester tester3 = new Tester(new FibGoldTask(), "resources/4.Fibo");
        tester3.runTests();

        Tester tester4 = new Tester(new FibMatrixTask(), "resources/4.Fibo");
        tester4.runTests();
    }
}
