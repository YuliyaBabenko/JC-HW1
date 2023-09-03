package ru.geekbrains.hw1.calc;

/**
 * Класс выполняет функцию эстетической обёртки результата.
 */

public class Decorator {

    /**
     *
     * @param a - число, требующее обёртки
     * @return - итоговая отформатированная строка
     */
    public static String decor(int a) {
        /*
         * Метод добавляет к результату строку с описанием
         * для форматирования результата вычислений.
         */
        return String.format("Your result is: %d.", a);
    }
}
