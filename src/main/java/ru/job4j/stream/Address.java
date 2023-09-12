package ru.job4j.stream;

import java.util.Objects;

public class Address {

    private String city;
    private String streets;
    private int home;
    private int apartment;

    public Address(String city, String streets, int home, int apartment) {
        this.city = city;
        this.streets = streets;
        this.home = home;
        this.apartment = apartment;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address address = (Address) o;
        return home == address.home && apartment == address.apartment && Objects.equals(city, address.city) && Objects.equals(streets, address.streets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, streets, home, apartment);
    }
}
