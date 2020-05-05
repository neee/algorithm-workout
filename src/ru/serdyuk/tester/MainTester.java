package ru.serdyuk.tester;

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
    }
}
