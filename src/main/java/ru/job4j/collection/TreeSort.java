package ru.job4j.collection;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSort {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        System.out.println(numbers);

        Set<Integer> numbersReverser = new TreeSet<>(Collections.reverseOrder());
        numbersReverser.addAll(numbers);
        System.out.println(numbersReverser);
    }
}
