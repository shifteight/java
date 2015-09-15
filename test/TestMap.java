import java.util.*;
public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> m1 = new HashMap<String, Integer>();
        m1.put("one", 1);
        m1.put("two", 2);
        m1.put("three", 3);

        if(m1.containsKey("two")) {
            int i = m1.get("two");
            System.out.println(i);
        }
    }
}
