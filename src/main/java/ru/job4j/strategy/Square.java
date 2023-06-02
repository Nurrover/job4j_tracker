package ru.job4j.strategy;

public class Square implements Shape {
    @Override
    public String drawn() {
        String ln = System.lineSeparator();
        return "-------" + ln
             + "|     |" + ln
             + "|     |" + ln
             + "-------" + ln;
    }
}
