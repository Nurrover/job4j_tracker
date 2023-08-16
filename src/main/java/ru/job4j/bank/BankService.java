package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public boolean deleteUser(String passport) {
        return users.remove(findByPassport(passport)) != null;
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        boolean add = true;
        for (Account el : users.get(user)) {
            if (account.getRequisite().equals(el.getRequisite())) {
                add = false;
                break;
            }
        }

        if (add) {
            users.get(user).add(account);
        }
    }

    public User findByPassport(String passport) {
        User rsl = null;
        for (User user : users.keySet()) {
            if (passport.equals(user.getPassport())) {
                rsl = user;
            }
        }
        return rsl;
    }

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

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
