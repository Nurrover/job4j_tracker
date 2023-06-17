package ru.job4j.ex;

public class Fact {
    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N could not be less than 0");
        }
        int rsl = 1;
        for (int number = 2; number <= n; number++) {
            rsl *= number;
        }

        return rsl;
    }

    public static void main(String[] args) {
        new Fact().calc(-1);
    }
}
