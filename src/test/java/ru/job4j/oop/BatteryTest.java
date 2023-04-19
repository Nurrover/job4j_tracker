package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class BatteryTest {

    @Test
    public void whenThis30Another50ThenAnotherLoadEqual80() {
        Battery charger = new Battery(30);
        Battery another = new Battery(50);
        int expected = 80;
        charger.exchange(another);
        assertThat(another.about()).isEqualTo("My charge: " + expected + "%");
    }

    @Test
    public void whenThis80Another20ThenThisLoadEqual0() {
        Battery charger = new Battery(80);
        Battery another = new Battery(20);
        int expected = 0;
        charger.exchange(another);
        assertThat(charger.about()).isEqualTo("My charge: " + expected + "%");
    }

    @Test
    public void whenThis95Another0ThenAnotherEqual95() {
        Battery charge = new Battery(95);
        Battery another = new Battery(0);
        int expected = 95;
        charge.exchange(another);
        assertThat(another.about()).isEqualTo("My charge: " + expected + "%");
    }
}