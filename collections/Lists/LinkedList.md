A **`LinkedList`** is another highly popular implementation of the `List` interface in Java.

While an `ArrayList` uses a dynamic array behind the scenes, a `LinkedList` uses a **doubly-linked list** data structure. Instead of sitting next to each other in one continuous block of memory, elements in a `LinkedList` are scattered everywhere.

Each element lives in its own container called a **Node**.

Every node contains two things:

1. The actual **data** (the value you stored).
2. **Pointers/References** to the next node and the previous node in the line.

---

## `ArrayList` vs `LinkedList`: The Core Difference

* **`ArrayList` (Like a row of stadium seats):** If you want to jump straight to seat #5, it’s instant. But if you want to force someone into seat #1, everyone else has to slide down one seat. (Fast lookups, slow insertions/deletions in the middle).
* **`LinkedList` (Like a human treasure hunt):** The first person holds a note pointing to the second person, who points to the third. If you want to find person #5, you have to walk through 1, 2, 3, and 4 first. But if you want to add someone new in the middle, you just change where two people point. (Slow lookups, fast insertions/deletions).

---

## Essential `LinkedList` Methods

Because `LinkedList` implements both `List` and `Deque` (Double-Ended Queue) interfaces, it has extra methods to add/remove items from the very beginning or the very end instantly.

### 1. Adding Elements

* **`add(element)`**: Appends an item to the end.
* **`addFirst(element)`**: Inserts the item at the very beginning (Index 0).
* **`addLast(element)`**: Inserts the item at the very end.

### 2. Accessing Elements

* **`get(index)`**: Fetches the item at that position (requires walking through the nodes).
* **`getFirst()`**: Instantly grabs the first item.
* **`getLast()`**: Instantly grabs the last item.

### 3. Removing Elements

* **`removeFirst()`**: Deletes the first item.
* **`removeLast()`**: Deletes the last item.

---

## Practical Example

Here is a complete program demonstrating how a `LinkedList` behaves, specifically highlighting how it manipulates both ends of the list effortlessly (perfect for simulating things like a browser history or a queue).

```java
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> playlist = new LinkedList<>();

        // 1. Adding elements normal way
        playlist.add("Song B");
        playlist.add("Song C");
        System.out.println("Initial Playlist: " + playlist); // [Song B, Song C]

        // 2. Add elements to the front and back instantly
        playlist.addFirst("Song A"); // Goes to the very front
        playlist.addLast("Song D");  // Goes to the very back
        System.out.println("After Head/Tail Adds: " + playlist); // [Song A, Song B, Song C, Song D]

        // 3. Accessing elements
        System.out.println("Now Playing (First): " + playlist.getFirst()); // Song A
        System.out.println("Last up next (Last): " + playlist.getLast());   // Song D
        System.out.println("Song at index 2: " + playlist.get(2));         // Song C

        // 4. Removing elements from both ends
        playlist.removeFirst(); // Removes "Song A"
        playlist.removeLast();  // Removes "Song D"
        System.out.println("Final Playlist after removals: " + playlist); // [Song B, Song C]
        
        // 5. Iterating through the LinkedList
        System.out.println("Remaining songs loop:");
        for (String song : playlist) {
            System.out.println("- " + song);
        }
    }
}

```

---

## Interview Cheat Sheet: Performance Comparison

| Operation | `ArrayList` | `LinkedList` | Reason for `LinkedList` performance |
| --- | --- | --- | --- |
| **Get by index** | $O(1)$ (Instant) | $O(n)$ (Slow) | Must start at the head node and count forward step-by-step. |
| **Insert at beginning** | $O(n)$ (Slow) | $O(1)$ (Fast) | No shifting needed. Just update the new node's pointer to point to the old head. |
| **Insert at end** | $O(1)$ (Fast) | $O(1)$ (Fast) | It keeps a direct pointer reference to the `tail` node. |

Do you want to see an interview-style coding problem specifically focused on linked lists, or are you ready to jump into Sets or Maps?