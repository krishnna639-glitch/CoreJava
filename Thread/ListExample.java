import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        
        // ---- 1. ARRAYLIST EXAMPLE ----
        // Best for storing and accessing data
        List<String> arrayList = new ArrayList<>();
        
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        
        // Fast random access (by index)
        System.out.println("ArrayList element at index 1: " + arrayList.get(1)); 


        // ---- 2. LINKEDLIST EXAMPLE ----
        // Best for manipulating data (frequent insertions/deletions)
        List<String> linkedList = new LinkedList<>();
        
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Rabbit");
        
        // Elements are linked together sequentially
        System.out.println("LinkedList element at index 1: " + linkedList.get(1));
    }
}