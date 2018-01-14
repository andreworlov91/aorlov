package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test.
 *
 * @author AndrewOrlov (stagereagle6@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class WordInOtherWordTest {
    private static WordInOtherWord instance;

    /**
     * Test answer.
     */
    private static WordInOtherWord getInstance() {
        if (instance == null) {
            instance = new WordInOtherWord();
        }
        return instance;
    }

    /**
     * Test contains.
     */
    @Test
    public void whenAddOneWordAndSubWordThenGetTrue() {
        Assert.assertTrue("Isn't True!", getInstance().contains("Привет", "иве"));
    }

    /**
     * Test contains.
     */
    @Test
    public void whenAddOneWordAndSubWordThenGetFalse() {
        Assert.assertFalse("Isn't False!", getInstance().contains("Привет", "ивт"));
    }
}
