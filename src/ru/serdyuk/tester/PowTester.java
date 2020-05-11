package ru.serdyuk.tester;

import ru.serdyuk.tester.task.pow.FastPowerBitwisePowerTask;
import ru.serdyuk.tester.task.pow.FastPowerDivPowerTask;

public class PowTester {

    public static void main(String[] args) {
        Tester tester1 = new Tester(new FastPowerBitwisePowerTask(), "resources/3.Power");
        tester1.runTests();

        Tester tester2 = new Tester(new FastPowerDivPowerTask(), "resources/3.Power");
        tester2.runTests();
    }
}
