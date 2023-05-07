package ru.job4j.varargs;

public class VarArgs {

    public static String text(String... strings) {
        StringBuilder builder = new StringBuilder();
        for (String string : strings) {
            builder.append(string);
        }
        return builder + " Количество соединенный элементов: " + strings.length;
    }

    public static String text(int x, int y, String... strings) {
        StringBuilder builder = new StringBuilder();
        builder.append(x);
        builder.append(y);
        for (String string : strings) {
            builder.append(string);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(text("nur"));
        System.out.println(text("nur", "lan"));
        System.out.println(text("nur", "lan", " Saf", "arov"));
        System.out.println(text(20, 30, "nur"));
    }
}
