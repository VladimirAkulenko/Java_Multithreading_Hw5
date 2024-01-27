import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {

    PhoneBook phoneBook = new PhoneBook();

    @Test
    public void add() {
        phoneBook.add("Marta", "12345");
        phoneBook.add("Mark", "45678");
        int actual = phoneBook.add("Alex", "60442");
        Assertions.assertEquals(3, actual);
    }

    @Test
    public void addRepeatName() {
        phoneBook.add("Marta", "12345");
        phoneBook.add("Mark", "45678");
        phoneBook.add("Julia", "98346");
        int actual = phoneBook.add("Mark", "60442");
        Assertions.assertEquals(3, actual);
    }

    @Test
    public void findByNumber() {
        phoneBook.add("Marta", "12345");
        phoneBook.add("Mark", "45678");
        phoneBook.add("Julia", "98346");
        String actual = phoneBook.findByNumber("12345");
        Assertions.assertEquals("Marta", actual);
    }

    @Test
    public void findByNumberNull() {
        phoneBook.add("Marta", "12345");
        phoneBook.add("Mark", "45678");
        phoneBook.add("Julia", "98346");
        String actual = phoneBook.findByNumber("15745");
        Assertions.assertEquals(null, actual);
    }

    @Test
    public void findByNumberEmpty() {
        String actual = phoneBook.findByNumber("12345");
        Assertions.assertEquals(null, actual);
    }
}
