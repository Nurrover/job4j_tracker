package ru.job4j.pojo;

public class Book {
    private String name;
    private int sheet;

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, int sheet) {
        this.name = name;
        this.sheet = sheet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSheet() {
        return sheet;
    }

    public void setSheet(int sheet) {
        this.sheet = sheet;
    }
}
