package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> person = new ArrayList<>();

    public void add(Person person) {
        this.person.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person people : person) {
            if (key.contains(people.getName()) || key.contains(people.getSurname())
                    || key.contains(people.getPhone()) || key.contains(people.getAddress())) {
                result.add(people);
            }
        }
        return result;
    }
}
