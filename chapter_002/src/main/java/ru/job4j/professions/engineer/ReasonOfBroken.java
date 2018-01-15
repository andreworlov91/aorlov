package ru.job4j.professions.engineer;

/**
 * ReasonOfBroken.
 *
 * @author Andrew Orlov (stagereagle6@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class ReasonOfBroken extends Engineer {

    public String message;

    public String getMessage() {
        return message;
    }

    public ReasonOfBroken(Engineer engineer, Product product) {
        message = "Инженер " + engineer.getName() + " ремонтирует изделие: " + product.getName();
    }
}
