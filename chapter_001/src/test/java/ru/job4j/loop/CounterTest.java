package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Andrew Orlov (stagereagle6@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class CounterTest {

    /**
     * test add
     */
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter counter = new Counter();

        int sum = counter.add(1, 10);

        assertThat(sum, is(30));
    }
}