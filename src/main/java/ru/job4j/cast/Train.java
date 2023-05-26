package ru.job4j.cast;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println("Движется по рельсам со скоростью 50 км/ч");
    }

    @Override
    public void brake() {
        System.out.println("Осуществляется торможение на рельсах");
    }
}
