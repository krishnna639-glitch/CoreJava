
# Basic

```java
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collections;
```

## 1 .Create a LinkedList and add 5 elements.

```java

    // Create a LinkedList of Strings
        LinkedList<String> fruits = new LinkedList<>();

        // Adding 5 elements to the LinkedList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Displaying the elements of the LinkedList
        System.out.println("LinkedList Elements: " + fruits);
```

## 2. Insert an element at the beginning and end.

```java

// Insert an element at the beginning (index 0)
        names.addFirst("Alice");

        // Insert an element at the end
        names.addLast("Evan");
```
## 3. Remove first and last elements.

```java
        //remove first element 
        String removedFirst = team.removeFirst();
        System.out.println("Removed First Element: " + removedFirst);

        // Remove the last element
        String removedLast = team.removeLast();
        System.out.println("Removed Last Element: " + removedLast);
```

## 4. Display all elements using Iterator.

```java
    // Create a LinkedList and add elements
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Obtain an Iterator for the LinkedList
        Iterator<String> iterator = cars.iterator();

        System.out.println("Displaying elements using Iterator:");
        
        // Loop through the collection while there are more elements
        while (iterator.hasNext()) {
            String car = iterator.next();
            System.out.println(car);
```

# Intermidiate

## 5. Reverse a LinkedList.

```java
    System.out.println("Original LinkedList: " + letters);

        // Reverse the LinkedList using Collections.reverse()
        Collections.reverse(letters);

        System.out.println("Reversed LinkedList: " + letters);
```

## 6. Find the middle element of a LinkedList.

```java
import java.util.LinkedList;

public class LinkedListMiddleElement {
    public static void main(String[] args) {
        // Create a LinkedList and add elements
        LinkedList<String> list = new LinkedList<>();
        list.add("Node 1");
        list.add("Node 2");
        list.add("Node 3"); // Middle Element
        list.add("Node 4");
        list.add("Node 5");

        System.out.println("LinkedList: " + list);

        // Finding the middle element using the two-pointer approach simulation
        if (!list.isEmpty()) {
            int slowIdx = 0;
            int fastIdx = 0;

            // Simulate the slow and fast pointer movement over the list indices
            while (fastIdx < list.size() && fastIdx + 1 < list.size()) {
                slowIdx += 1;       // Moves 1 step
                fastIdx += 2;       // Moves 2 steps
            }

            String middle = list.get(slowIdx);
            System.out.println("The middle element is: " + middle);
        } else {
            System.out.println("The list is empty.");
        }
    }
}
```

## 7. Remove duplicate elements from LinkedList.

```java
import java.util.LinkedList;
import java.util.LinkedHashSet;

public class LinkedListRemoveDuplicates {
    public static void main(String[] args) {
        // Create a LinkedList with duplicate elements
        LinkedList<String> languages = new LinkedList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("Java"); // Duplicate
        languages.add("C++");
        languages.add("Python"); // Duplicate

        System.out.println("Original LinkedList: " + languages);

        // Pass the LinkedList to a LinkedHashSet to remove duplicates and keep order
        LinkedHashSet<String> set = new LinkedHashSet<>(languages);

        // Clear the original list and add the unique elements back
        languages.clear();
        languages.addAll(set);

        System.out.println("After Removing Duplicates: " + languages);
    }
}
```

## 8. Search for a specific element.

```java
import java.util.LinkedList;

public class LinkedListSearchExample {
    public static void main(String[] args) {
        // Create a LinkedList and add elements
        LinkedList<String> frameworkList = new LinkedList<>();
        frameworkList.add("Spring");
        frameworkList.add("Hibernate");
        frameworkList.add("Struts");
        frameworkList.add("Play");

        System.out.println("LinkedList: " + frameworkList);

        String searchElement = "Hibernate";

        // Method 1: Using contains() to check if the element exists
        if (frameworkList.contains(searchElement)) {
            // Method 2: Using indexOf() to find the position of the element
            int index = frameworkList.indexOf(searchElement);
            System.out.println("Element '" + searchElement + "' found at index: " + index);
        } else {
            System.out.println("Element '" + searchElement + "' does not exist in the LinkedList.");
        }
    }
}
```

## 9. convert linked list into arraylist

```java
import java.util.LinkedList
import java.util.ArrayList;

public class LinkedListToArrayList {
    public static void main(String[] args) {
        // Create a LinkedList and add elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Spring");
        linkedList.add("Hibernate");
        linkedList.add("Struts");
        linkedList.add("Play");

        System.out.println("Original LinkedList: " + linkedList);

        // Convert LinkedList to ArrayList by passing it to the ArrayList constructor
        ArrayList<String> arrayList = new ArrayList<>(linkedList);

        // Display the converted ArrayList
        System.out.println("Converted ArrayList: " + arrayList);
        
        // Verification check to confirm it's an ArrayList instance
        if (arrayList instanceof ArrayList) {
            System.out.println("Successfully converted to ArrayList.");
        }
    }
}
```
```
10 , 11 , 12 are remaining
```