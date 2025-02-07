package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public String sound() {
        return "may-may";
    }

    public void showFood() {
        System.out.println(this.food);
    }

    public void showName() {
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        System.out.println("There is gav's food.");
        Cat gav = new Cat();
        gav.eat("cutlet");
        gav.giveNick("gav");
        gav.showName();
        gav.showFood();
        System.out.println("There is black's food.");
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("black");
        black.showName();
        black.showFood();
    }
}
