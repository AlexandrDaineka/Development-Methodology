import Daineka.PhoneBook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        int contactCount = phoneBook.add("John", "1234567890");
        assertEquals(1, contactCount);
    }

    @Test
    public void testFindByNumber(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Sasha", "123");
        phoneBook.add("Alex", "321");
        String result = phoneBook.findByNumber("123");
        assertEquals("Sasha", result);
    }

    @Test
    public void testFindByName(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Sasha", "123");
        phoneBook.add("Alex", "321");
        String result = phoneBook.findByName("Alex");
        assertEquals(result, "321");
    }
    @Test
    public void testPrintAllNames(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Sasha", "123");
        phoneBook.add("Alex", "321");
        phoneBook.add("Bob Bee", "888");
        phoneBook.printAllNames();

    }
}
