package ru.job4j.ex;

public class Count {
    public static int add(int start, int finished) {
        if (start > finished) {
            throw new IllegalArgumentException("Start should be less than finish.");
        }

        int rsl = 0;
        for (int index = start; index < finished; index++) {
            rsl += index;
        }

        return rsl;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 2 to 10 is : " + Count.add(10, 2));
    }
}
