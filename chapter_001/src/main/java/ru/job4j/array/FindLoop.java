package ru.job4j.array;

/**
 * @author Andrew Orlov (stagereagle6@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class FindLoop {

    /**
     * Метод indexOf для вычисления индекса
     * элемента в массиве.
     *
     * @param data - массив чисел.
     * @param el - численный элемент массива.

     */
    public int indexOf(int[] data, int el) {

        int rsl = -1;

        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rsl = index;

                break;
            }
        }

        return rsl;
    }
}
