package ru.job4j.strategy;

public class Triangle implements Shape {
    @Override
    public String drawn() {
        String ln = System.lineSeparator();
        return    "   ^    " + ln
                + " /   \\ " + ln
                + "/_____\\" + ln;
    }
}
