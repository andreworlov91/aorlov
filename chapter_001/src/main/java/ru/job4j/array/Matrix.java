package ru.job4j.array;

/**
 * @author Andrew Orlov (stagereagle6@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Matrix {

    /**
     * Метод multiple для составления таблицы умножения.
     *
     * @param size - размер целочисленного массива.
     */
    public int[][] multiple(int size) {
        int[][] arr = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%4d", (arr[i][j] = (i + 1) * (j + 1)));
            }
            System.out.println("");
        }

        return arr;
    }
}
