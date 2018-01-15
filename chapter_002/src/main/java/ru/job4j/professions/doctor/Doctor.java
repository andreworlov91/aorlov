package ru.job4j.professions.doctor;

import ru.job4j.Profession;

/**
 * Doctor.
 *
 * @author Andrew Orlov (stagereagle6@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Doctor extends Profession {

    public Doctor() {

    }

    public Doctor(String name) {
        this.name = name;
    }

    /**
     * Метод heal для возврата строки
     * о том, какой врач лечит какого пациента.
     *
     * @param pacient - пациент.
     */
    public Diagnose heal(Pacient pacient) {
        return new Diagnose(this, pacient);
    }
}
