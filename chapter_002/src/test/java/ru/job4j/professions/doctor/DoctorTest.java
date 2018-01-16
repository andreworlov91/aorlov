package ru.job4j.professions.doctor;

import org.junit.Test;
import ru.job4j.Profession;

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
        Profession doctor =  new Doctor("Сергей");
        Doctor doctor1 = (Doctor) doctor;
        assertThat(doctor1.heal(new Pacient("Дмитрий")).getMessage(), is("Доктор Сергей лечит пациента по имени: Дмитрий"));
    }
}
