package ru.job4j.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ScopeInside {
    private static String first = "Гав";
    private static String second = "Муу";

    public static void main(String[] args) {
        String name = echo(
                () -> {
                    String ay = "ауууууууу";
                    return ay;
                }
        );
        System.out.println(name);

        String ay = "ауууууууу";
        String name2 = echo(() -> ay);
        System.out.println(name2);

        String ayy = "ауууууууу";
        ayy = "aaaaaaa";
        String tmp = ayy;
        String name3 = echo(() -> tmp);
        System.out.println(name3);

        String test = echo(
                () -> {
                    second = "Мяу";
                    return first + second;
                }
        );
        System.out.println(test);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(throwingExceptionConsumerWrapper(
                System.out::println
        ));
    }

    public static String echo(Supplier<String> supplier) {
        String sound = supplier.get();
        return sound + " " + sound + " " + sound;
    }

    @FunctionalInterface
    public interface ThrowingExceptionConsumer<T, E extends Exception> {
        void accept(T t) throws E;
    }

    static <T> Consumer<T> throwingExceptionConsumerWrapper(
            ThrowingExceptionConsumer<T, Exception> throwingExceptionConsumer) {
        return x -> {
            try {
                throwingExceptionConsumer.accept(x);
            } catch (Exception e) {
                throw new RuntimeException();
            }
        };
    }
}
