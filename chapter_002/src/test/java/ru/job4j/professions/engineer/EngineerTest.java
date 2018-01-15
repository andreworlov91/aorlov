package ru.job4j.professions.engineer;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 *
 * @author Andrew Orlov (stagereagle6@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class EngineerTest {

    /**
     * test doRemont
     */
    @Test
    public void whenOneEngineerDoesRemontProductThenWeGetWhoDoesRemontSomeProduct() {
        assertThat(new Engineer("Сергей").doRemont(new Product("Холодильник")).getMessage(), is("Инженер Сергей ремонтирует изделие: Холодильник"));
    }
}
