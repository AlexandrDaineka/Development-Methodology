package Daineka;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<String> contacts = new ArrayList<>();

    public int add(String name, String number){
        String contact = name + ": " + number;
        if (!contacts.contains(contact)){
            contacts.add(contact);
        }
        return contacts.size();
    }
    public String findByNumber(String number){
        for (String contact : contacts){
            if(contact.endsWith(": " + number)){
                int index = contact.indexOf(":");
                return contact.substring(0, index);
            }
        }
        return null; // Если совпадения не найдено, возвращает `null`.
    }

    public String findByName(String name){
        return null;
    }



}
