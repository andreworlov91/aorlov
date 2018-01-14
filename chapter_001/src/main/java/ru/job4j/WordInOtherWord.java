package ru.job4j;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
     * @param  origin - полная строка для проверки.
     * @param  sub - подстрока.
     */
    boolean contains(String origin, String sub) {
            Pattern p = Pattern.compile("(" + sub + ")");
            Matcher m = p.matcher(origin);
            return m.find();
    }
}
