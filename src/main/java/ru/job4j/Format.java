package ru.job4j;

import java.util.Calendar;

public class Format {
    public static void getGreeting(String name, int age) {
        System.out.println(String.format("Привет! Я %s, мой возраст: %d", name, age));
    }

    public static void boolFormat(boolean answer, int age) {
        System.out.println(String.format("Вы хотите сегодня погулять: %b", answer));
        System.out.println(String.format("Вам больше 0 годиков: %b", age));
    }

    public static void charFormat(char ch) {
        System.out.println(String.format("Jo%c4j", ch));
    }

    public static void getGreetingAndTime(String name) {
        Calendar instance = Calendar.getInstance();
        System.out.println(String.format("Привет, %s! Текущая дата: %tF, Текущее время: %tT", name, instance, instance));
    }

    public static void floatingPoint(double number) {
        System.out.println(String.format("Задаем число 0.99 - %.2f", number));
    }

    public static void fullFormat(double number1, double number2) {
        System.out.println(String.format("Первый пример: %2$,+016.2f . Второй пример: %1$,+023.4f", number1, number2));
    }

    public static void main(String[] args) {
        getGreeting("Нурлан", 20);
        boolFormat(true, 21);
        charFormat('b');
        getGreetingAndTime("Нурлан");
        floatingPoint(0.99);
        fullFormat(5000000.0000, 1213123131312.23);
    }

}
