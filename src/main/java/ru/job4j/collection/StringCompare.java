package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        int minIndex = Math.min(left.length(), right.length());
        for (int index = 0; index != minIndex; index++) {
            rsl = Character.compare(left.charAt(index), right.charAt(index));
            if (rsl != 0) {
                break;
            }
        }

        return rsl != 0 ? rsl : Integer.compare(left.length(), right.length());
    }
}
