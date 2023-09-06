package ru.job4j.function;

import java.util.function.Function;
import java.util.function.Predicate;

public class StrategyUsage {
    public boolean empty(String s) {
        return s.isEmpty();
    }

    public boolean startWith(String s, String pref) {
        return s.startsWith(pref);
    }

    public boolean contains(String s, String key) {
        return s.contains(key);
    }

    public boolean check(Predicate<String> predicate, String s) {
        return predicate.test(s);
    }

    public String transform(Function<String, String> fun, String s) {
        return fun.apply(s);
    }

    public static void main(String[] args) {
        StrategyUsage usage = new StrategyUsage();
        System.out.println(
                "Резульатат работы: " + usage.check(
                        str -> str.isEmpty(), ""
                )
        );
        System.out.println(
                "Результат работы: " + usage.check(
                        str -> str.startsWith("Fun"), "Functional interface"
                )
        );
        System.out.println(
                "Результат работы: " + usage.check(
                        str -> str.contains("rn"), "Surname Name"
                )
        );
        System.out.println(
                "Строка после преобразования: " + usage.transform(
                        str -> str.toUpperCase(), "aBCdEfghKLmnpRstU"
                )
        );
        System.out.println(
                "Строка после преобразования: " + usage.transform(
                        str -> str.concat("работает корректно."), "Строка после преобразования: "
                )
        );
        System.out.println(
                "Строка после преобразования: " + usage.transform(
                        str -> str.trim(), "    aBC dEfghK Lmnp RstU        "
                )
        );
    }
}
