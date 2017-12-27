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
     * @param first - входящая точка.
     * @param second - входящая точка.
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }
}
