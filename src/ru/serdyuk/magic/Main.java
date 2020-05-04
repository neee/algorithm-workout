package ru.serdyuk.magic;

import java.util.Map;

public class Main {

    static final int SIZE = 25;

    static Map<String, Magic> magics = Map.of(
        "no_name", (i, j) -> j > SIZE / 2 - 1 && i > SIZE / 2 || j < SIZE / 2 && i < SIZE / 2 + 1,
        "01.jpg",  (i, j) -> j > i
    );

    public static void main(String[] args) {

        System.out.println("01.jpg");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (j > i) {
                    System.out.print("#  ");
                } else {
                    System.out.print(".  ");
                }
            }
            System.out.println();
        }
        System.out.println("02.jpg");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (j == i) {
                    System.out.print("#  ");
                } else {
                    System.out.print(".  ");
                }
            }
            System.out.println();
        }
        System.out.println("03.jpg");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (j == SIZE - 1 - i) {
                    System.out.print("#  ");
                } else {
                    System.out.print(".  ");
                }
            }
            System.out.println();
        }
        System.out.println("04.jpg");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (j < SIZE + 5 - i) {
                    System.out.print("#  ");
                } else {
                    System.out.print(".  ");
                }
            }
            System.out.println();
        }
        System.out.println("05.jpg");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i * 2 == j || i * 2 + 1 == j) {
                    System.out.print("#  ");
                } else {
                    System.out.print(".  ");
                }
            }
            System.out.println();
        }
        System.out.println("06.jpg");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i < 10 || j < 9) {
                    System.out.print("#  ");
                } else {
                    System.out.print(".  ");
                }
            }
            System.out.println();
        }
        System.out.println("07.jpg");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i > 15 && j > 15) {
                    System.out.print("#  ");
                } else {
                    System.out.print(".  ");
                }
            }
            System.out.println();
        }
        System.out.println("08.jpg");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i == 0 || j == 0) {
                    System.out.print("#  ");
                } else {
                    System.out.print(".  ");
                }
            }
            System.out.println();
        }
        System.out.println("09.jpg");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (j > 10 + i || (i > 10 && j < i - 10)) {
                    System.out.print("#  ");
                } else {
                    System.out.print(".  ");
                }
            }
            System.out.println();
        }
        System.out.println("10.jpg");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i < j && j < i * 2 + 2) {
                    System.out.print("#  ");
                } else {
                    System.out.print(".  ");
                }
            }
            System.out.println();
        }
        System.out.println("11.jpg");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i == 1 || i == SIZE - 2 || j == 1 || j == SIZE - 2) {
                    System.out.print("#  ");
                } else {
                    System.out.print(".  ");
                }
            }
            System.out.println();
        }
        System.out.println("18.jpg");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i * (j - 1) == 0 && j != 0 || j * (i - 1) == 0 && i != 0) {
                    System.out.print("#  ");
                } else {
                    System.out.print(".  ");
                }
            }
            System.out.println();
        }
        System.out.println("20.jpg");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("#  ");
                } else {
                    System.out.print(".  ");
                }
            }
            System.out.println();
        }
        System.out.println("19.jpg");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i * j == 0 || (i == SIZE - 1) || (j == SIZE - 1)) {
                    System.out.print("#  ");
                } else {
                    System.out.print(".  ");
                }
            }
            System.out.println();
        }
        System.out.println("23.jpg");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i % 3 == 0 && j % 2 == 0) {
                    System.out.print("#  ");
                } else {
                    System.out.print(".  ");
                }
            }
            System.out.println();
        }
        System.out.println("23.jpg");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i == j || j == SIZE - 1 - i) {
                    System.out.print("#  ");
                } else {
                    System.out.print(".  ");
                }
            }
            System.out.println();
        }
    }
}
