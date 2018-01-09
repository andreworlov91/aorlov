package ru.job4j.array;

/**
 * @author Andrew Orlov (stagereagle6@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Square {

    /**
     * Метод calculate для заполнения массива через
     * цикл элементами от 1 до bound возведенные в квадрат
     *
     * @param bound - высота.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];

        for (int i = 0; i < rst.length; i++) {
            rst[i] = (int) Math.pow(i, 2);
        }

        return rst;
    }
}
