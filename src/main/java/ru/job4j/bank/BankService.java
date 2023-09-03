package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает простейшую версию банковской системы, у которого есть
 * пользователи и их счета
 * @author Safarov Nurlan
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение пользователей системы с привязанными к ним счетами
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает нового пользователя и добавляет его в систему
     * @param user новый пользователь, который будет добавлен в систему
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод принимает на вход паспорт
     * и удалеяет пользователя с таким паспортом из системы
     * @param passport паспорт, который использует для поиска
     * пользователя в системе
     * @return возвращает true, если пользователь был удален,
     * и false, если пользователя не было в системе
     */
    public boolean deleteUser(String passport) {
        return users.remove(new User(passport, "")) != null;
    }

    /**
     * Метод принимает на вход паспорт, баковский счет
     * и позволяет добавить к пользователю в системе новый счет
     * @param passport паспорт, который использует для поиска
     * пользователя в системе
     * @param account счет, который будет добавлен к пользователю в систему
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                users.get(user).add(account);
            }
        }
    }

    /**
     * Метод принимает на вход паспорт
     * и ищет пользователя в системе по пааспорту
     * @param passport паспорт, который помогает найти пользователя в системе
     * @return возвращает найденного пользователя в сисете
     * или null, если его нет
     */
    public User findByPassport(String passport) {
        User rsl = null;
        for (User user : users.keySet()) {
            if (passport.equals(user.getPassport())) {
                rsl = user;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод принимает на вход паспорт, реквизиты
     * и ищет пользователя в системе по паспорту, после чего
     * ищет нужный банковский счет, который привязан к пользователю,
     * по рекизиту
     * @param passport паспорт, который использует для поиска пользователя
     * @param requisite реквизит, который использует
     * для поиска привязанного счета к пользователю
     * @return возвращает найденный счет, если он был найден у пользователя,
     * или null, если такого счета нет или пользователя не существует
     */
    public Account findByRequisite(String passport, String requisite) {
        List<Account> accounts = users.getOrDefault(findByPassport(passport), new ArrayList<>());
        Account rsl = null;
        for (Account account : accounts) {
            if (requisite.equals(account.getRequisite())) {
                rsl = account;
                break;
            }
        }

        return rsl;
    }

    /**
     * Метод принимает на вход два паспорта, два счета
     * и позволяет пересчитлить деньги с одного счета на другой
     * @param srcPassport паспорт, который помогает найти пользователя
     * для дальнейшего перевода денег с его счета
     * @param srcRequisite реквизит, который помогает найти у пользователя
     * нужный счет для перевода денег
     * @param destPassport паспорт, котоорый помогает найти пользователя
     * для дальнйшего принятия денег на один из его счетов
     * @param destRequisite реквизит, который помогает найти у пользователя
     * нужный счет для принятия денег с другого счета
     * @param amount сумма, которую нужно перевести с одного счета на другой
     * @return возвращает true, если деньги были переведены,
     * и false, если деньги не были переведены: нет таких пользователей,
     * банковских счетов, на счету недостаточно денег для пеервода
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account accountOne = findByRequisite(srcPassport, srcRequisite);
        Account accountTwo = findByRequisite(destPassport, destRequisite);
        if (accountOne != null && accountTwo != null && accountOne.getBalance() >= amount) {
            accountOne.setBalance(accountOne.getBalance() - amount);
            accountTwo.setBalance(accountTwo.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }

    /**
     * Метод который принимает пользователя и позволяет найти все его счита
     * @param user пользователь, которому привязанны счета
     * @return вовзращет список всех счетов привязанного к пользователю в системе
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
