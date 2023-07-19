package Daineka;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<String> contacts = new ArrayList<>();

    public int add(String name, String number) {
        String contact = name + ": " + number;
        if (!contacts.contains(contact)) {
            contacts.add(contact);
        }
        return contacts.size();
    }

    public String findByNumber(String number) {
        for (String contact : contacts) {
            if (contact.endsWith(": " + number)) {
                int index = contact.indexOf(":");
                return contact.substring(0, index);
            }
        }
        return null; // Если совпадения не найдено, возвращает `null`.
    }

    public String findByName(String name) {
        for (String contact : contacts) {
            if (contact.startsWith(name)) {
                int index = contact.indexOf(":");
                if (index != -1) {
                    return contact.substring(index + 2);
                }
            }
        }
        return null; // Если совпадения не найдено, возвращает `null`.
    }
}
