package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNegativeNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, -4, 32, 0, 123, -434, 400);
        List<Integer> positive = numbers.stream().filter(x -> x > 0).collect(Collectors.toList());
        positive.forEach(System.out::println);
    }
}
