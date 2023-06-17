package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (key.equals(value[index])) {
                rsl = index;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("The element is not in the array");
        }

        return rsl;
    }

    public static void sent(String values, String[] abuses) throws ElementAbuseException {
        for (String element : abuses) {
            if (values.equals(element)) {
                throw new ElementAbuseException("Contains a forbidden word");
            }
        }
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String[] value = {"n", "u", "k", "s"};
        String key = "j";
        try {
            FindEl.indexOf(value, key);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
