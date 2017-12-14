package ru.job4j;

/**
 * Calculate.
 *
 * @author Andrew Orlov (stagereagle6@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Calculate {

    /**
     * Метод main для вывода фразы Hello World!
     *
     * @param args - параметр метода.
     */
    public static void main(String... args) {
        System.out.println("Hello World!");
    }

	/**
     * Method echo.
     *
     * @param name Andrew Orlov.
     * @return Echo plus your name.
     */
    public String echo(String name) {
        return "Echo, echo, echo : " + name;
    }
}