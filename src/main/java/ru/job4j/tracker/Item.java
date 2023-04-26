package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class Item {
    private int id;
    private String name;
    private LocalDateTime created = LocalDateTime.now();

    public String getDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        return LocalDateTime.now().format(formatter);
    }

    public Item() { }

    public Item(String name) {
        this.name = name;
    }

    public Item(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}