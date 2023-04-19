package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return x - y;
    }

    public int multiply(int y) {
        return x * y;
    }

    public int divide(int y) {
        return x / y;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + multiply(y) + divide(y);
    }

    public static void main(String[] args) {
        int a = 2;
        int result = Calculator.minus(a);
        System.out.println(result);
        Calculator calculator = new Calculator();
        result = calculator.divide(a);
        System.out.println(result);
        result = calculator.sumAllOperation(a);
        System.out.println(result);
    }
}
