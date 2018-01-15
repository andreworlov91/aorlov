package ru.job4j.professions.teacher;

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
public class TeacherTest {

    /**
     * test teach
     */
    @Test
    public void whenOneTeacherTeachesPupilThenWeGetWhoWhoTeachesSomeOnePupil() {
        assertThat(new Teacher("Сергей").teach(new Pupil("Дашенька")).getMessage(), is("Учитель Сергей учит ученика: Дашенька"));
    }
}
