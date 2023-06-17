package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User user : users) {
            if (login.equals(user.getUsername())) {
                rsl = user;
                break;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("This login does not exist");
        }

        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() && user.getUsername().length() > 3) {
            throw new UserInvalidException("The user is invalid");
        }

        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Peter Arsentev", true)
        };
        try {
            User user = findUser(users, "Peter Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
