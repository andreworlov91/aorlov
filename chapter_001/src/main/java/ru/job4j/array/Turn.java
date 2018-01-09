package ru.job4j.array;

/**
 * @author Andrew Orlov (stagereagle6@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Turn {

    /**
     * Метод back для инвертирования
     * чисел в массиве.
     *
     * @param array - массив чисел.
     */
    int[] back(int[] array) {
        int tmp = 0;
        for (int i = 0; i < array.length/2; i++) {
            tmp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = tmp;
        }

        return array;
    }
}
