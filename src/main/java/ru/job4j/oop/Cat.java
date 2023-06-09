package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void show() {
        String ln = System.lineSeparator();
        System.out.printf("The cat's name is %s. He was eating %s" + ln, this.name, this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public String sound() {
        String voice = "may-may";
        return voice;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("gav");
        gav.eat("kotleta");
        gav.show();
        Cat black = new Cat();
        black.giveNick("black");
        black.eat("fish");
        black.show();
    }
}
