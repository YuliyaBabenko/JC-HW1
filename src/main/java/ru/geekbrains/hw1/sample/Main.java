package ru.geekbrains.hw1.sample;

import ru.geekbrains.hw1.calc.Calculator;
import ru.geekbrains.hw1.calc.Decorator;

/**
 * Основной клас приложения.
 * Содержит в себе основное назначение и способы взаимодействия с ним.
 */

public class Main {

    /**
     * Точка входа в приложение.
     * @param args - стандартные аргументы командной строки.
     */
    public static void main(String[] args) {
        int result = Calculator.sum(3, 6);
        System.out.println(Decorator.decor(result));
        result = Calculator.sub(7, 4);
        System.out.println(Decorator.decor(result));
        result = Calculator.mul(2, 9);
        System.out.println(Decorator.decor(result));
        result = Calculator.div(30, 5);
        System.out.println(Decorator.decor(result));
    }
}
