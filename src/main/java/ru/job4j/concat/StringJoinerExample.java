package ru.job4j.concat;

import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        joiner.add("abc").add("def").add("hgi");
        System.out.println(joiner);
        String joined = joiner.toString();
        System.out.println(joined);
    }
}
