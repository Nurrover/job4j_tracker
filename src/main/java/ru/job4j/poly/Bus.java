package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Автобус едет");
    }

    @Override
    public void countPass(int count) {
        System.out.println("Количество пассажиров в автобусе: " + count);
    }

    @Override
    public int refill(int liter) {
        return liter * 52;
    }
}
