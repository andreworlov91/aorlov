package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Andrew Orlov (stagereagle6@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class FactorialTest {

    private static Factorial instance;
    private static int fact;

    private static Factorial getInstance() {
        if (instance == null) {
            instance = new Factorial();
        }
        return instance;
    }

    /**
     * test calc
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        fact = getInstance().calc(5);

        assertThat(fact, is(120));
    }

    /**
     * test calc
     */
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        fact = getInstance().calc(0);

        assertThat(fact, is(1));
    }
}