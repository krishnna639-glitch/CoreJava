
---

## 1. Adding Elements

These methods are used to put data into your `ArrayList`.

* **`add(element)`**: Appends the element to the end of the list.
* **`add(index, element)`**: Inserts the element at a specific position (index) and shifts the existing elements to the right.

### Example:

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // Adding to the end
        fruits.add("Apple");
        fruits.add("Banana");
        
        // Inserting at a specific index (0 is the first position)
        fruits.add(0, "Mango"); 

        System.out.println(fruits); // Output: [Mango, Apple, Banana]
    }
}

```

---

## 2. Accessing & Updating Elements

These methods let you read or change elements that are already in the list.

* **`get(index)`**: Returns the element at the specified position. Remember, Java indices start at `0`.
* **`set(index, newElement)`**: Replaces the element at the specified position with a new one.
* **`size()`**: Returns the total number of elements in the list (similar to `.length` for arrays).

### Example:

```java
ArrayList<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");

// Get an element
String firstPerson = names.get(0); // "Alice"

// Update an element
names.set(1, "Charlie"); // Replaces "Bob" with "Charlie"

// Get the size
int totalItems = names.size(); // 2

System.out.println("List: " + names + ", Size: " + totalItems);
// Output: List: [Alice, Charlie], Size: 2

```

---

## 3. Removing Elements

These methods let you delete items from your list.

* **`remove(index)`**: Removes the element at the specified position and shifts remaining elements to the left.
* **`remove(Object)`**: Finds the first occurrence of the specified object and removes it. Returns `true` if it found it, `false` otherwise.
* **`clear()`**: Removes *all* elements from the list, leaving it completely empty.

### Example:

```java
ArrayList<String> tasks = new ArrayList<>();
tasks.add("Clean");
tasks.add("Cook");
tasks.add("Code");

// Remove by index
tasks.remove(1); // Removes "Cook"

// Remove by object name
tasks.remove("Clean"); // Removes "Clean"

System.out.println(tasks); // Output: [Code]

// Clear everything
tasks.clear();
System.out.println(tasks); // Output: []

```

---

## 4. Checking & Searching Elements

These methods help you look through your list to verify if something exists.

* **`contains(Object)`**: Returns `true` if the list contains the specified element.
* **`indexOf(Object)`**: Returns the index of the *first* occurrence of the element. Returns `-1` if the item isn't found.
* **`isEmpty()`**: Returns `true` if the list contains no elements.

### Example:

```java
ArrayList<String> colors = new ArrayList<>();
colors.add("Red");
colors.add("Blue");
colors.add("Red");

// Check if an item exists
boolean hasBlue = colors.contains("Blue"); // true

// Find the index of an item
int firstRedPosition = colors.indexOf("Red"); // 0
int greenPosition = colors.indexOf("Green");   // -1 (doesn't exist)

// Check if empty
boolean isListEmpty = colors.isEmpty(); // false

```

---

## Complete Blueprint: Putting It All Together

Here is a complete, runnable Java program showcasing a real-world workflow using an `ArrayList`:

```java
import java.util.ArrayList;

public class ArrayListMasterclass {
    public static void main(String[] args) {
        // 1. Create an ArrayList of Integers
        ArrayList<Integer> scores = new ArrayList<>();

        // 2. Add data
        scores.add(85);
        scores.add(92);
        scores.add(78);
        System.out.println("Initial scores: " + scores); // [85, 92, 78]

        // 3. Modify data
        scores.set(2, 95); // Change 78 to 95
        System.out.println("After modification: " + scores); // [85, 92, 95]

        // 4. Check contents
        if (scores.contains(92)) {
            System.out.println("A score of 92 exists at index: " + scores.indexOf(92));
        }

        // 5. Loop through the ArrayList (Using a for-each loop)
        System.out.println("Printing all scores via loop:");
        for (Integer score : scores) {
            System.out.println("- " + score);
        }

        // 6. Remove data
        scores.remove(0); // Removes 85
        System.out.println("Final scores after removal: " + scores); // [92, 95]
    }
}

```
