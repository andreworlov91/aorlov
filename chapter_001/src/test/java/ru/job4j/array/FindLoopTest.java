package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Andrew Orlov (stagereagle6@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class FindLoopTest {

    /**
     * test indexOf
     */
    @Test
    public void whenAddElementThenWeGetIndexThree() {
        FindLoop findLoop = new FindLoop();
        int[] mas = {0, 1, 4, 9};
        int searchIndex = findLoop.indexOf(mas, 9);

        assertThat(searchIndex, is(3));
    }
}
