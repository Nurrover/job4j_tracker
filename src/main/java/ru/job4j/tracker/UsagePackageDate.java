package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class UsagePackageDate {
    public static void main(String[] args) {
        LocalDateTime currentDateTime  = LocalDateTime.now();
        System.out.println("Текущие дата и время: " + currentDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
        String currentDateTimeFormat = currentDateTime.format(formatter);
        System.out.println("Текущие дата и время после форматирования: " + currentDateTimeFormat);
    }
}
