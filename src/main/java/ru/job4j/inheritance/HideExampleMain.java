package ru.job4j.inheritance;

public class HideExampleMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new CatB();
        animal.instanceInvoke();
        cat.instanceInvoke();
        Animal.staticInvoke();
        cat.staticInvoke();
        Animal other = null;
        other.staticInvoke();
        CatB kitty = new CatB();
        kitty.staticInvoke();
    }
}
