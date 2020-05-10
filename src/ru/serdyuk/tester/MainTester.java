package ru.serdyuk.tester;

import ru.serdyuk.tester.task.GCDBinaryTask;
import ru.serdyuk.tester.task.GCDMinusTask;
import ru.serdyuk.tester.task.GCDModuloTask;
import ru.serdyuk.tester.task.LuckyTicketTask;
import ru.serdyuk.tester.task.StringLengthTask;
import ru.serdyuk.tester.task.Task;

public class MainTester {

    public static void main(String[] args) {
        Task task = new StringLengthTask();

        Tester tester0 = new Tester(task, "resources/0.String");
        tester0.runTests();

        Tester tester1 = new Tester(new LuckyTicketTask(), "resources/1.Tickets");
        tester1.runTests();

        //GCD
        Tester tester2 = new Tester(new GCDBinaryTask(), "resources/2.GCD");
        tester2.runTests();

        Tester tester3 = new Tester(new GCDMinusTask(), "resources/2.GCD");
        tester3.runTests();

        Tester tester4 = new Tester(new GCDModuloTask(), "resources/2.GCD");
        tester4.runTests();
    }
}
