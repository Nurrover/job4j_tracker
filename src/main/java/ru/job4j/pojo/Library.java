package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code");
        Book scarletSails = new Book("Scarlet sails", 50);
        Book musketeers = new Book("The Three Musketeers", 1000);
        Book reader = new Book("Reader", 123);
        Book[] list = new Book[4];
        list[0] = cleanCode;
        list[1] = scarletSails;
        list[2] = musketeers;
        list[3] = reader;
        for (Book book : list) {
            System.out.println(book.getName() + " - " + book.getSheet());
        }
        list[0] = reader;
        list[3] = cleanCode;
        for (Book book : list) {
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getSheet());
            }
        }
     }
}
