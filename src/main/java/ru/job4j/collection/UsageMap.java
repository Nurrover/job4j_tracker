package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("nurlan.safarov2018@yandex.ru", "Сафров Нурлан Афлатун оглы");
        hashMap.put("nurlan.safarov2018@yandex.ru", "Сафров Нурлан");
        hashMap.put("nurlan_safarov_00@mail.ru", "Сафров Нурлан");
        hashMap.put("parsentev@yandex.ru", "Petr Arsentev");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
