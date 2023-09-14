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
        Predicate<Person> comparatorName = p -> p.getName().contains(key);
        Predicate<Person> comparatorSurname = p -> p.getSurname().contains(key);
        Predicate<Person> comparatorPhone = p -> p.getPhone().contains(key);
        Predicate<Person> comparatorAddress = p -> p.getAddress().contains(key);
        var combine = comparatorName.or(comparatorSurname)
                .or(comparatorPhone).or(comparatorAddress);
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }

        return result;
    }

}
