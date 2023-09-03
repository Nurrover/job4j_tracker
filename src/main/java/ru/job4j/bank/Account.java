package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает работу простешей версии банковского счета пользователя,
 * у которого есть баланс и реквизиты
 * @author Nurlan Safarov
 * @version 1.0
 */
public class Account {

    /**
     * Реквизиты для перевода денег с одного банковского счета в другой
     */
    private String requisite;
    /**
     * Баланс который доступен в банковском счету
     */
    private double balance;

    /**
     * Метод принимает на вход реквизит, баланс
     * и создает по ним новый аккаунт
     * @param requisite реквизит счета, который служит идификацией
     * @param balance баланс, который доступен в банковском счету
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод позволяет получить реквизит счета
     * @return возвращает реквизит привязанного к счету
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод принимает на вход новый реквизит
     * и изменяет его в банковском счету
     * @param requisite новый реквизит банковского счета
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод позволяет получить какой баланс доступен в банковском счету
     * @return возвращает баланс банковского счета
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод принимает на вход новый баланс и изменяет его в банковском счету
     * @param balance новый баланс в банковском счету
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Метод принимает на вход объект и позволяет нам проверить
     * на равенство банковского счета и объект
     * Метод является одним из условий контакрта для определения
     * равенства двух банковских счетов
     * @param o объект, который использует для проверки равенства
     * @return возрвращает true только в том случае,
     * если у баковский счетов одинааковые реквизиты, и вовзвращает false
     * только в том случае, если реквизиты у баковский счетов разные
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return  Objects.equals(requisite, account.requisite);
    }

    /**
     * Метод позволяет нам узнать хеш-код банковского счета по реквизиту.
     * Метод является одним из условий контакрта для определения
     * равенства двух и более аккаунтов
     * @return вовзвращает хеш-код
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
