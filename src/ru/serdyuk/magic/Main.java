package ru.serdyuk.magic;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    static final int SIZE = 25;

    static Map<String, Magic> samples = Map.ofEntries(
        Map.entry("no.jpg", (i, j) -> j > SIZE / 2 - 1 && i > SIZE / 2 || j < SIZE / 2 && i < SIZE / 2 + 1),
        Map.entry("01.jpg", (i, j) -> j > i),
        Map.entry("02.jpg", (i, j) -> j == i),
        Map.entry("03.jpg", (i, j) -> j == SIZE - 1 - i),
        Map.entry("04.jpg", (i, j) -> j < SIZE + 5 - i),
        Map.entry("05.jpg", (i, j) -> i * 2 == j || i * 2 + 1 == j),
        Map.entry("06.jpg", (i, j) -> i < 10 || j < 9),
        Map.entry("07.jpg", (i, j) -> i > 15 && j > 15),
        Map.entry("08.jpg", (i, j) -> i == 0 || j == 0),
        Map.entry("09.jpg", (i, j) -> j > 10 + i || (i > 10 && j < i - 10)),
        Map.entry("10.jpg", (i, j) -> i < j && j < i * 2 + 2),
        Map.entry("11.jpg", (i, j) -> i == 1 || i == SIZE - 2 || j == 1 || j == SIZE - 2),
        Map.entry("18.jpg", (i, j) -> i * (j - 1) == 0 && j != 0 || j * (i - 1) == 0 && i != 0),
        Map.entry("19.jpg", (i, j) -> i * j == 0 || (i == SIZE - 1) || (j == SIZE - 1)),
        Map.entry("20.jpg", (i, j) -> (i + j) % 2 == 0),
        Map.entry("23.jpg", (i, j) -> i % 3 == 0 && j % 2 == 0),
        Map.entry("24.jpg", (i, j) -> i == j || j == SIZE - 1 - i)
    );

    public static void main(String[] args) {
        new TreeMap<>(samples)
            .forEach((k, v) -> {
                    System.out.println(k);
                    for (int i = 0; i < SIZE; i++) {
                        for (int j = 0; j < SIZE; j++) {
                            if (v.doMagic(i, j)) {
                                System.out.print("#  ");
                            } else {
                                System.out.print(".  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println("-".repeat(SIZE * 3 - 1));
                }
            );
    }
}
