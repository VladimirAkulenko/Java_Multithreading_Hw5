import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private Map<String, String> phoneBook = new TreeMap<>();

    public int add(String name, String phone) {
        if (!phoneBook.containsKey(name) && !phoneBook.containsValue(phone)) {
            phoneBook.putIfAbsent(name, phone);
        }
        return phoneBook.size();
    }

    public String findByNumber(String phone) {
        return phoneBook.entrySet().stream()
                .filter(v -> v.getValue().equals(phone)).
                map(Map.Entry::getKey).
                findFirst().orElse(null);
    }

}
