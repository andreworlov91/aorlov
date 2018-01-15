package ru.job4j.professions.doctor;

/**
 * Diagnose.
 *
 * @author Andrew Orlov (stagereagle6@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Diagnose extends Doctor {

    public String message;

    public String getMessage() {
        return message;
    }

    public Diagnose(Doctor doctor, Pacient pacient) {
        message = "Доктор " + doctor.getName() + " лечит пациента по имени: " + pacient.getName();
    }
}
