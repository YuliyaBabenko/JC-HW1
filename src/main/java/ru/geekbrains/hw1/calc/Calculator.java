package ru.geekbrains.hw1.calc;

/**
 * Основной класс, описывающий простейшие арифметические вычисления.
 */

public class Calculator {

    /**
     * Функция сложения
     * @param a - первое слагаемое
     * @param b - второе слагаемое
     * @return - результат вычислений
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * Функция умножения
     * @param a - первый множитель
     * @param b - второй множитель
     * @return - результат вычислений
     */
    public static int mul(int a, int b) {
        return a * b;
    }

    /**
     * Функция деления
     * @param a - делимое
     * @param b - делитель
     * @return - результат вычислений
     */
    public static int div(int a, int b) {
        return a / b;
    }

    /**
     * Функция вычитания
     * @param a - уменьшаемое
     * @param b - вычитаемое
     * @return - результат вычислений
     */
    public static int sub(int a, int b) {
        return a - b;
    }
}
