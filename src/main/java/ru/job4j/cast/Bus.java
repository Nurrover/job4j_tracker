package ru.job4j.cast;

public class Bus implements Vehicle {

    @Override
    public void move() {
        System.out.println("Ехать по дороге со скорость 60 км/ч");
    }

    @Override
    public void brake() {
        System.out.println("Тормозить на дороге");
    }
}
