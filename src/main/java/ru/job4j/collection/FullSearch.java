package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FullSearch {
    public Set<String> extractNumber(List<Task> tasks) {
        HashSet<String> set = new HashSet<>();
        for (Task element : tasks) {
            set.add(element.getNumber());
        }

        return set;
    }
}
