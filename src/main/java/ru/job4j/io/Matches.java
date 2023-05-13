package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3: ");
            int matches = Integer.parseInt(input.nextLine());
            if (matches < 1 || matches > 3) {
                System.out.println("Надо ввести число от 1 до 3. Попробуйте ещё раз");
            } else if (count - matches < 0) {
                System.out.println("Слишком много взяли. Попробуйте ещё раз.");
            } else {
                count -= matches;
                turn = !turn;
                System.out.println("Осталось из 11 спичек " + count);
            }
            System.out.println();
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
