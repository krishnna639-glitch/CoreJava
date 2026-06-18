import java.util.*;

public class practice {
    public static void main(String[] args) {
        // Create a list of strings (fruits)
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // Adding a duplicate to test
        
        System.out.println("Before remove: " + fruits);
        
        // This removes only the FIRST occurrence of "Apple"
        fruits.remove("Apple");
        
        System.out.println("After remove: " + fruits);
    }
}