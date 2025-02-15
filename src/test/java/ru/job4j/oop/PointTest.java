package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class PointTest {

    @Test
    public void whenX0Y0ToX2Y2Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        assertThat(a.distance(b)).isEqualTo(expected);
    }

    @Test
    public void whenX10Y0ToX5Y0Then5() {
        Point a = new Point(10, 0);
        Point b = new Point(5, 0);
        double expected = 5;
        assertThat(a.distance(b)).isEqualTo(expected);
    }

    @Test
    public void whenX7Y12ToX0Y12Then7() {
        Point a = new Point(7, 12);
        Point b = new Point(0, 12);
        double expected = 7;
        assertThat(a.distance(b)).isEqualTo(expected);
    }

}