package ru.serdyuk.tester.task;

import java.util.List;

public class StringLengthTask implements Task {

    @Override
    public Object run(List<String> data) {
        return "" + data.get(0).length();
    }
}
