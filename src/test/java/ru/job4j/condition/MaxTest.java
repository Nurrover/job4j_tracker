package ru.job4j.condition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    public void whenMax1To2Then() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int out = Max.max(left, right);
        Assertions.assertEquals(expected, out);
    }

    @Test
    public void whenMax10To3Then() {
        int left = 10;
        int right = 3;
        int expected = 10;
        int out = Max.max(left, right);
        Assertions.assertEquals(expected, out);
    }

    @Test
    public void whenMax42To42Then() {
        int left = 42;
        int right = 42;
        int expected = 42;
        int out = Max.max(left, right);
        Assertions.assertEquals(expected, out);
    }

    @Test
    public void when10And20And100ThenMax100() {
        int left = 10;
        int middle = 20;
        int right = 100;
        int expected = 100;
        int out = Max.max(left, middle, right);
        assertThat(out).isEqualTo(expected);
    }
    @Test
    public void whenMinus10And0AndMinus5ThenMax0() {
        int left = -10;
        int middle = 0;
        int right = -5;
        int expected = 0;
        int out = Max.max(left, middle, right);
        assertThat(out).isEqualTo(expected);
    }
    @Test
    public void when45AndMinus12And0ThenMax45() {
        int left = 45;
        int middle = 12;
        int right = 0;
        int expected = 45;
        int out = Max.max(left, middle, right);
        assertThat(out).isEqualTo(expected);
    }
    @Test
    public void when3And3And3ThenMax3() {
        int left = 3;
        int middle = 3;
        int right = 3;
        int expected = 3;
        int out = Max.max(left, middle, right);
        assertThat(out).isEqualTo(expected);
    }
    @Test
    public void when100And2And56And304ThenMax304() {
        int first = 100;
        int second = 2;
        int third = 56;
        int four = 304;
        int expected = 304;
        int out = Max.max(first, second, third, four);
        assertThat(out).isEqualTo(expected);
    }
    @Test
    public void when19And24And102And100ThenMax102() {
        int first = -19;
        int second = 24;
        int third = 102;
        int four = 100;
        int expected = 102;
        int out = Max.max(first, second, third, four);
        assertThat(out).isEqualTo(expected);
    }
    @Test
    public void whenMinus15And0AndMinus9AndMinus2ThenMax0() {
        int first = -15;
        int second = 0;
        int third = -9;
        int four = -2;
        int expected = 0;
        int out = Max.max(first, second, third, four);
        assertThat(out).isEqualTo(expected);
    }
    @Test
    public void when54AndMinus21And0And24ThenMax54() {
        int first = 54;
        int second = -21;
        int third = 0;
        int four = 24;
        int expected = 54;
        int out = Max.max(first, second, third, four);
        assertThat(out).isEqualTo(expected);
    }
    @Test
    public void when1And1And1And1ThenMax1() {
        int first = 1;
        int second = 1;
        int third = 1;
        int four = 1;
        int expected = 1;
        int out = Max.max(first, second, third, four);
        assertThat(out).isEqualTo(expected);
    }

}