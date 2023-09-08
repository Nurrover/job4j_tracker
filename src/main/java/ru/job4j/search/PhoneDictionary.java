package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        Predicate<Person> combine = (p) -> (
                key.contains(p.getName()) || key.contains(p.getSurname())
                || key.contains(p.getPhone()) || key.contains(p.getAddress())
                );
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }

        return result;
    }

}
