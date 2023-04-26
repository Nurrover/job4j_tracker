package ru.job4j.pojo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ShopTest {
    @Test
    public void whenThreeNull() {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        int rsl = Shop.indexOfNull(products);
        int expected = 3;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenFirstNull() {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        int rsl = Shop.indexOfNull(products);
        int expected = 1;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenNotNull() {
        Product[] products = new Product[3];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        int rsl = Shop.indexOfNull(products);
        int expected = -1;
        assertThat(rsl).isEqualTo(expected);
    }

}