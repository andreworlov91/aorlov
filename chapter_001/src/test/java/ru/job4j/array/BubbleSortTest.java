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
public class BubbleSortTest {

    /**
     * test sort
     */
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] massSort = bubbleSort.sort(new int[] {1, 5, 4, 2, 3, 1, 7, 8, 0, 5});

        assertThat(massSort, is(new int[] {0, 1, 1, 2, 3, 4, 5, 5, 7, 8}));
    }
}
