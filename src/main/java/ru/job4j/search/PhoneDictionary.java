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
        Predicate<Person> comparatorName = p -> key.contains(p.getName());
        Predicate<Person> comparatorSurname = p -> key.contains(p.getSurname());
        Predicate<Person> comparatorPhone = p -> key.contains(p.getPhone());
        Predicate<Person> comparatorAddress = p -> key.contains(p.getAddress());
        Predicate<Person> combine = comparatorName.or(comparatorSurname)
                .or(comparatorPhone).or(comparatorAddress);
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }

        return result;
    }

}
