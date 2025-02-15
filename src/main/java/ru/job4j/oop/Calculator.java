package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + minus(a) + multiply(a) + divide(a);
    }

    public static void main(String[] args) {
        int number = 5;
        Calculator calculator = new Calculator();
        int result = calculator.multiply(number);
        System.out.println(result);
        result = calculator.divide(number);
        System.out.println(result);
        result = Calculator.sum(number);
        System.out.println(result);
        result = Calculator.minus(number);
        System.out.println(result);
        result = calculator.sumAllOperation(number);
        System.out.println(result);
    }
}
