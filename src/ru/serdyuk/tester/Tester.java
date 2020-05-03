package ru.serdyuk.tester;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import ru.serdyuk.tester.task.Task;

public class Tester {

    Task task;

    String path;

    public Tester(Task task, String path) {
        this.task = task;
        this.path = path;
    }

    public void runTests() {
        int nr = 0;
        while (true) {
            Path inFile = Path.of(String.format("%s/test.%d.in", path, nr));
            Path outFile = Path.of(String.format("%s/test.%d.out", path, nr));

            if (!Files.exists(inFile) || !Files.exists(outFile)) {
                break;
            }
            System.out.println(String.format("Test %d - %s", nr,  runTest(inFile, outFile)));
            nr++;
        }
    }

    boolean runTest(Path inFile, Path outFile) {
        try {
            List<String> data = Files.readAllLines(inFile);
            String expect = Files.readString(outFile).trim();
            String actual = task.run(data);
            return actual.equals(expect);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
