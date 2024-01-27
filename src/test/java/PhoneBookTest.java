import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {

    @Test
    public void add(){
        PhoneBook phoneBook = new PhoneBook();
        int expected = 3;
        int actual;
        phoneBook.add("Marta", "12345");
        phoneBook.add("Mark", "45678");
        actual = phoneBook.add("Alex", "60442");
        assertEquals(expected, actual);
        //assertEquals(String.format("Число контактов [%s] не соответствует заведенному [%s]", expected, actual),expected,actual);
    }

    @Test
    public void addRepeatName(){

    }

    @Test
    public void addRepeatPhone(){

    }
}
