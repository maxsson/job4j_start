package ru.job4j.calculator;

import ru.job4j.math.MathFunction;


public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static double delAndMin(double first, double second) {
        return MathFunction.del(first, second)
                + MathFunction.min(first, second);
    }
    public static double all(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.min(first, second)
                + MathFunction.multiply(first, second)
                + MathFunction.del(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + delAndMin(10, 20));
        System.out.println("Результат расчета равен: " + all(10, 20));
    }
}
