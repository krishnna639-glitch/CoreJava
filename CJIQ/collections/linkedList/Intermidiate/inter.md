
# 

## 1.Reverse a LinkedList.

To reverse a LinkedList in Java, you can either use the built-in Collections.reverse() method for a quick solution, or reverse the pointers manually if asked to implement it from scratch in an interview.

```java
import java.util.LinkedList;
import java.util.Collections;

public class ReverseLinkedListBuiltIn {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Original List: " + list);

        // Reverse the list using Collections utility
        Collections.reverse(list);

        System.out.println("Reversed List: " + list);
    }
}

```
---

## 2.Find the middle element of a LinkedList.

```java

```