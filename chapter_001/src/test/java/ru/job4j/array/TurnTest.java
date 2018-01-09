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
public class TurnTest {

    private static Turn instance;

    private static Turn getInstance() {
        if (instance == null) {
            instance = new Turn();
        }
        return instance;
    }

    /**
     * test back.
     */
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        assertThat(new int[] {4, 1, 6, 2}, is(getInstance().back(new int[] {2, 6, 1, 4})));
    }

    /**
     * test back.
     */
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        assertThat(new int[] {5, 4, 3, 2, 1}, is(getInstance().back(new int[] {1, 2, 3, 4, 5})));
    }
}
