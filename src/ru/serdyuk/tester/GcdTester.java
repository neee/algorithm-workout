package ru.serdyuk.tester;

import ru.serdyuk.tester.task.gcd.GCDBinaryTask;
import ru.serdyuk.tester.task.gcd.GCDMinusTask;
import ru.serdyuk.tester.task.gcd.GCDModuloTask;

public class GcdTester {

    public static void main(String[] args) {
        Tester tester1 = new Tester(new GCDBinaryTask(), "resources/2.GCD");
        tester1.runTests();

        Tester tester2 = new Tester(new GCDMinusTask(), "resources/2.GCD");
        tester2.runTests();

        Tester tester3 = new Tester(new GCDModuloTask(), "resources/2.GCD");
        tester3.runTests();
    }
}
