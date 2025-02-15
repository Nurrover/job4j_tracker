package ru.job4j.max;

public class Reduce {
    private int[] array;

    public void to(int[] inputArray) {
        this.array = inputArray;
    }

    public void print() {
        for (int i : this.array) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}