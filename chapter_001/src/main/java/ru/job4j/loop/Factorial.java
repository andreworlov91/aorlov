package ru.job4j.loop;

/**
 * @author Andrew Orlov (stagereagle6@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Factorial {

    /**
     * Метод calc для подсчёта факториала
     * целого числа
     *
     * @param n - число.
     */
    public int calc(int n) {
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }
}
