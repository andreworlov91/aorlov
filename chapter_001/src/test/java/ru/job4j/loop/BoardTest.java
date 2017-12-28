package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *
 * @author Andrew Orlov (stagereagle6@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class BoardTest {

    /**
     * test paint
     */
    @Test
    public void whenPaintBoardWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows() {
        Board board = new Board();
        String rsl = board.paint(3, 3);
        String ln = System.getProperty("line.separator");
        assertThat(rsl, is(
                String.format("X X%s X %sX X%s", ln, ln, ln)
                )
        );
    }

    /**
     * test paint
     */
    @Test
    public void whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFour() {
        Board board = new Board();
        String rsl = board.paint(5, 4);
        String ln = System.getProperty("line.separator");
        assertThat(rsl, is(
                String.format("X X %s X X%sX X %s X X%sX X %s", ln, ln, ln, ln, ln)
                )
        );
    }
}