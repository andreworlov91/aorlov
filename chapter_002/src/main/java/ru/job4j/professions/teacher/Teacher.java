package ru.job4j.professions.teacher;

import ru.job4j.Profession;

/**
 * Teacher.
 *
 * @author Andrew Orlov (stagereagle6@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Teacher extends Profession {

    public Teacher() {

    }

    public Teacher(String name) {
        this.name = name;
    }

    /**
     * Метод teach для возврата строки
     * о том, какой учитель учит какого ученика.
     *
     * @param pupil - ученик.
     */
    public Grade teach(Pupil pupil) {
        return new Grade(this, pupil);
    }
}
