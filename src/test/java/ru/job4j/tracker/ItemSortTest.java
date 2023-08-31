package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ItemSortTest {
    @Test
    public void whenItemAscByName() {
        List<Item> items = Arrays.asList(
                new Item("ItemB", 1),
                new Item("ItemA", 2),
                new Item("ItemC", 3)
        );
        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item("ItemA", 2),
                new Item("ItemB", 1),
                new Item("ItemC", 3)
        );
        assertThat(items).isEqualTo(expected);
    }

    @Test
    public void whenItemDescByName() {
        List<Item> items = Arrays.asList(
                new Item("ItemB", 1),
                new Item("ItemA", 2),
                new Item("ItemC", 3)
        );
        items.sort(new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item("ItemC", 3),
                new Item("ItemB", 1),
                new Item("ItemA", 2)
        );
        assertThat(items).isEqualTo(expected);
    }
}