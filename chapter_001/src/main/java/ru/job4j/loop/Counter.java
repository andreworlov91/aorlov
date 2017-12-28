package ru.job4j.loop;

/**
 * Counter.
 *
 * @author Andrew Orlov (stagereagle6@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Counter {

    /**
     * Метод add для подсчёта суммы чётных чисел
     * в указанном диапазоне.
     *
     * @param start - начало отсчёта.
     * @param start - диапазон.
     */
    int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++ ) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
