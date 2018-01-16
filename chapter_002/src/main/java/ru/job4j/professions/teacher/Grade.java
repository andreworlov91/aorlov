package ru.job4j.professions.teacher;

/**
 * Grade.
 *
 * @author Andrew Orlov (stagereagle6@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Grade {

    private String message;

    public String getMessage() {
        return message;
    }

    public Grade(Teacher teacher, Pupil pupil) {
        message = "Учитель " + teacher.getName() + " учит ученика: " + pupil.getName();
    }
}
