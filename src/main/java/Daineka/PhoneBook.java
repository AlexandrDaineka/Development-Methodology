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
}
