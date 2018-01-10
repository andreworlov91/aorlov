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
public class MatrixTest {

    /**
     * test multiple
     */
    @Test
    public void whenWeMultipleSizeThreeThenWeGetTable() {
        Matrix matrix = new Matrix();
        int[][] array = matrix.multiple(3);

        assertThat(array, is(new int[][]{{1, 2,3},
                {2, 4, 6},
                {3, 6, 9}
        }));
    }
}
