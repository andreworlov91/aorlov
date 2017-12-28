package ru.job4j.max;

/**
 * @author Andrew Orlov (stagereagle6@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Max {

    /**
     * Метод max для вычисления
     * максимального числа из двух
     *
     * @param first - первое число.
     * @param second - второе число.
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }

    /**
     * Метод max для вычисления
     * максимального числа из трёх
     *
     * @param first - первое число.
     * @param second - второе число.
     * @param third- третье число.

     */
    public int max(int first, int second, int third) {
        return Math.max(max(first, second), third);
    }
}
