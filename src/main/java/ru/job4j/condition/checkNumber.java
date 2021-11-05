package ru.job4j.condition;

public class checkNumber {
    public static String checkNumber1(int number) {
        boolean b1 = number % 5 == 0;
        boolean b2 = number % 3 == 0;
        String out = "Operation not support";
        if (b1) {
            out = "Hello";
        }
        if
        (b2) {
            out = "World";
        }
        if (b2 && b1) {
            out = "Hello, World!!!";
        }

        return out;
    }
}

