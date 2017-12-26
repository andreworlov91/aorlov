package ru.job4j.calculator;

/**
 * Calculator
 *
 * @author Andrew Orlov (stagereagle6@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Calculator {
    private double result;

    /**
     * Метод add для сложения двух double.
     *
     * @param first - первый аргумент.
     * @param second - второй аргумент.
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Метод subtract для вычитания двух double.
     *
     * @param first - первый аргумент.
     * @param second - второй аргумент.
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * Метод div для деления двух double.
     *
     * @param first - первый аргумент.
     * @param second - второй аргумент.
     */
    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Метод div для умножения двух double.
     *
     * @param first - первый аргумент.
     * @param second - второй аргумент.
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }

    public double getResult() {
        return this.result;
    }
}