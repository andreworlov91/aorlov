package ru.job4j;

/**
 * @author Andrew Orlov (stagereagle6@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class WordInOtherWord {

    /**
     * Метод sort для сортировки массива
     * пузырьковым методом.
     *
     * @param origin - полная строка для проверки.
     * @param sub    - подстрока.
     */
    public boolean contains(String origin, String sub) {
        if (sub.length() > origin.length()) return false;

        char[] original = origin.toCharArray();
        char[] substr = sub.toCharArray();

        for (int i = 0; i <= (original.length - substr.length); i++) {
            for (int j = 0; j < substr.length; j++) {
                if (original[i + j] != substr[j]) break;
                if (j == substr.length - 1) return true;
            }
        }

        return false;
    }
}
