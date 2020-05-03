package ru.serdyuk.magic;

public class Main {

    static final int SIZE = 25;

    public static void main(String[] args) {

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (j > SIZE/2 - 1 && i > SIZE/2 || j < SIZE/2 && i < SIZE/2 + 1) {
                    System.out.print("#  ");
                } else {
                    System.out.print("O  ");
                }
            }
            System.out.println();
        }
    }
}
