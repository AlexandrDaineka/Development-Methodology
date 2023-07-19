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
}
