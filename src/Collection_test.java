import java.util.HashMap;
import java.util.LinkedHashMap;

public class Collection_test {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> hash = new LinkedHashMap<>();
        hash.put(5, "Яблоко");
        hash.put(2, "Груша");
        hash.put(3, "Банан");
        hash.put(6, "Виноград");
        hash.put(8, "Дыня");
        hash.put(7, "Клубника");
        hash.put(4, "Арбуз");
        hash.put(1, "Манго");
        hash.put(1, "Манго");

        System.out.println(hash);
    }
}

