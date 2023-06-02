package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName()).isEqualTo(expected.getName());
    }

    @Test
    public void whenEditItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answer = {String.valueOf(item.getId()), "edited item"};
        StartUI.editItem(new StubInput(answer), tracker);
        Item edit = tracker.findById(item.getId());
        assertThat(edit.getName()).isEqualTo("edited item");
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("item");
        tracker.add(item);
        String[] answer = {String.valueOf(item.getId())};
        StartUI.deleteItem(new StubInput(answer), tracker);
        assertThat(tracker.findById(item.getId())).isNull();
    }
}