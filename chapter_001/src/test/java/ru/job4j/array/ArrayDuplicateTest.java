package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author AndrewOrlov (stagereagle6@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class ArrayDuplicateTest {

    /**
     * test remove
     */
    @Test
    public void whenDeleteDuplicateElementsThenGetUniqueMassive() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();

        String[] array = arrayDuplicate.remove(new String[] {"Привет", "Мир", "Привет", "Супер", "Мир"});

        assertThat(array, is(new String[] {"Привет", "Мир", "Супер"}));
    }
}
