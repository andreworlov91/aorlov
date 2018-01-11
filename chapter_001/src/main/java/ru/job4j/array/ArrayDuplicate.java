package ru.job4j.array;

import java.util.Arrays;

/**
 * @author Andrew Orlov (stagereagle6@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class ArrayDuplicate {

    /**
     * Метод remove для удаления дубликатов из
     * строкового массива.
     *
     * @param array - строковый массив.
     */
    public String[] remove(String[] array) {
        int dup = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - dup; j++) {
                if (array[i].equals(array[j])) {

                    String tmp = array[array.length - dup - 1];
                    array[array.length - dup - 1] = array[j];
                    array[j] = tmp;
                    dup++;
                }
            }
        }
        return Arrays.copyOf(array, array.length - dup);
    }
}
