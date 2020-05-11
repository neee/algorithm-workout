package ru.serdyuk.tester;

import ru.serdyuk.tester.task.LuckyTicketTask;
import ru.serdyuk.tester.task.StringLengthTask;

public class TicketsAndStringTester {

    public static void main(String[] args) {
        Tester tester1 = new Tester(new StringLengthTask(), "resources/0.String");
        tester1.runTests();

        Tester tester2 = new Tester(new LuckyTicketTask(), "resources/1.Tickets");
        tester2.runTests();
    }
}
