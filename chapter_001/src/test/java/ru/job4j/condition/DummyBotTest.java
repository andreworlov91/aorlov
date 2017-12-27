package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Andrew Orlov (stagereagle6@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class DummyBotTest {
    private static DummyBot instance;

    /**
     * Test answer.
     */
    private static DummyBot getInstance() {
        if (instance == null) {
            instance = new DummyBot();
        }
        return instance;
    }

    /**
     * Test answer.
     */
    @Test
    public void whenGreetBot() {
        assertThat(
                getInstance().answer("Привет, Бот."),
                is("Привет, умник.")
        );
    }

    /**
     * Test answer.
     */
    @Test
    public void whenByuBot() {
        assertThat(
                getInstance().answer("Пока."),
                is("До скорой встречи.")
        );
    }

    /**
     * Test answer.
     */
    @Test
    public void whenUnknownBot() {
        assertThat(
                getInstance().answer("Сколько будет 2 + 2?"),
                is("Это ставит меня в тупик. Спросите другой вопрос.")
        );
    }
}
