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
public class SquareTest {

    /**
     * Test calculate.
     */
    @Test
    public void whenCalculateFourNumsWhenHaveEqualsMassive() {
        Square square = new Square();
        int[] mas = square.calculate(4);
        int[] expectedMas = {0, 1, 4, 9};

        assertThat(mas, is(expectedMas));
    }
}
