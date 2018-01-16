package ru.job4j.professions.engineer;

import ru.job4j.Profession;

/**
 * Engineer.
 *
 * @author Andrew Orlov (stagereagle6@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Engineer extends Profession {

    public Engineer(String name) {
        super(name);
    }

    /**
     * Метод doRemont для возврата строки
     * о том, какой инженер ремонтирует какое изделие.
     *
     * @param product - продукт.
     */
    public ReasonOfBroken doRemont(Product product) {
        return new ReasonOfBroken(this, product);
    }
}
