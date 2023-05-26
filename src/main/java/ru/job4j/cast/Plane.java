package ru.job4j.cast;

public class Plane implements Vehicle {

    @Override
    public void move() {
        System.out.println("Летит со скорость 340 км/ч");
    }

    @Override
    public void brake() {
        System.out.println("Сбавляет скорость полёта");
    }
}
