package ru.job4j.professions.doctor;

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
public class DoctorTest {

    /**
     * test heal
     */
    @Test
    public void whenOneDoctorHealsPacientThenWeGetWhoHealsSomeonePacient() {
        assertThat(new Doctor("Сергей").heal(new Pacient("Дмитрий")).getMessage(), is("Доктор Сергей лечит пациента по имени: Дмитрий"));
    }
}
