package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает работу пользователя, у которого есть паспорт и ФИ
 * @author Safarov Nurlan
 * @version 1.0
 */
public class User {
    /**
     * Поле для хранения паспорта,
     * который служит индефикацией пользователя
     */
    private String passport;
    /**
     * Поле для хранения ФИ пользователя
     */
    private String username;

    /**
     * Метод принимает на вход паспорт, ФИ для создания юзера в системе
     * @param passport паспорт пользователя,
     * который служит индификацией
     * @param username ФИ пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод позволяте получить паспорт пользователя
     * @return возвращает паспорт
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод принимает на вход новый паспорт и заменяет старый на новый
     * @param passport новый паспорт для замены старого
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод позволяет получить ФИ пользователя
     * @return возвращает ФИ пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод принимает новое полное имя пользователя
     * и заменяет старое полное имя на новое
     * @param username новое полное имя пользователя для замены старого
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Метод принимает на вход объект и позволяет нам проверить
     * на равенство пользователя и объект
     * Метод является одним из условий контакрта для определения
     * равенства двух пользователей
     * @param o объект, который использует для проверки равенства
     * @return возрвращает true только в том случае,
     * если у пользователей одинааковые паспорта, и вовзвращает false
     * только в том случае, если паспопрта пользователей разные
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Метод позволяет нам узнать хеш-код пользователя по паспорту.
     * Метод является одним из условий контакрта для определения
     * равенства двух и более паспортов
     * @return вовзвращает хеш-код
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
