package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizenMap = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!citizenMap.containsKey(citizen.getPassport())) {
            citizenMap.put(citizen.getPassport(), citizen);
            rsl = true;
        }
        return rsl;
    }

    public Citizen get(String passport) {
        return citizenMap.get(passport);
    }
}
