package ru.job4j.oop;

public class HierarchyUsage {
    public static void main(String[] args) {
        Car car = new Car("мазда", "мазда");
        Transport tp = car;
        Object obj = car;
        Object ocar = new Car("бугати", "бугати");
        Car carFromObject = (Car) ocar;
        System.out.println(new Car("мазда", "мазда"));
        System.out.println(new Bicycle());
        System.out.println(new Object());
    }
}
