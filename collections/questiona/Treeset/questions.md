# Basic
```
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Iterator;
```

## 1. Store integers in a TreeSet and display sorted order.

```java
// 1. Store integers in a TreeSet and display sorted order
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(45);
        numbers.add(12);
        numbers.add(89);
        numbers.add(34);
        numbers.add(7);
        numbers.add(56);
        
        // TreeSet automatically sorts elements in natural ascending order
        System.out.println("1. TreeSet elements (Sorted Order): " + numbers);
```

## 2. Find smallest and largest elements.

```java
// 2. Find smallest and largest elements
        int smallest = numbers.first();
        int largest = numbers.last();
        System.out.println("2. Smallest Element: " + smallest);
        System.out.println("   Largest Element:  " + largest);
        System.out.println();


        System.out.println("=== INTERMEDIATE OPERATIONS ===");

        int target = 34;
```

# Intermediate

## 3. Find elements greater than a given number.

```java
// 3. Find elements greater than a given number (Strictly greater)
        // tailSet(element, false) returns a view of elements strictly greater than the element
        System.out.println("3. Elements greater than " + target + ": " + numbers.tailSet(target, false));
```

## 4. Find elements less than a given number.

```java
// 4. Find elements less than a given number (Strictly less)
        // headSet(element) returns a view of elements strictly less than the element
        System.out.println("4. Elements less than " + target + ": " + numbers.headSet(target));
```

## 5. Display TreeSet in descending order.

```java
// 5. Display TreeSet in descending order
        System.out.print("5. TreeSet in Descending Order: [");
        Iterator<Integer> descIterator = numbers.descendingIterator();
        while (descIterator.hasNext()) {
            System.out.print(descIterator.next() + (descIterator.hasNext() ? ", " : ""));
        }
        System.out.println("]");
```

## 6. Remove duplicate values and sort them.

```java
// 6. Remove duplicate values and sort them
        ArrayList<Integer> duplicatesList = new ArrayList<>();
        duplicatesList.add(20);
        duplicatesList.add(10);
        duplicatesList.add(20); // Duplicate
        duplicatesList.add(30);
        duplicatesList.add(10); // Duplicate
        System.out.println("Original ArrayList with duplicates: " + duplicatesList);

        // Passing the list to TreeSet eliminates duplicates and sorts them automatically
        TreeSet<Integer> uniqueSortedSet = new TreeSet<>(duplicatesList);
        System.out.println("6. After removing duplicates and sorting: " + uniqueSortedSet);
        System.out.println();


        System.out.println("=== ADVANCED OPERATIONS ===");

        int searchNum = 40;
```

# Advanced

## 7. Find the nearest higher and lower values of a given number.

```java
// 7. Find the nearest higher and lower values of a given number
        // higher() returns the least element strictly greater than the given element
        // lower() returns the greatest element strictly less than the given element
        Integer nearestHigher = numbers.higher(searchNum);
        Integer nearestLower = numbers.lower(searchNum);
        
        System.out.println("Current TreeSet: " + numbers);
        System.out.println("7. For given number " + searchNum + ":");
        System.out.println("   Nearest Higher Value: " + (nearestHigher != null ? nearestHigher : "None"));
        System.out.println("   Nearest Lower Value:  " + (nearestLower != null ? nearestLower : "None"));
        System.out.println();
```

## 8. Implement a leaderboard using TreeSet.

```java
// Add player scores
        leaderboard.add(new PlayerScore("Alice", 850));
        leaderboard.add(new PlayerScore("Bob", 920));
        leaderboard.add(new PlayerScore("Charlie", 740));
        leaderboard.add(new PlayerScore("Diana", 920)); // Identical score to test handling

        // Display current leaderboard rankings
        int rank = 1;
        for (PlayerScore player : leaderboard) {
            System.out.println("   Rank " + rank + ": " + player);
            rank++;
        }
    }

    /**
     * Helper Class representing a Player Score for Leaderboard tracking.
     * Implements Comparable to define descending order sorting logic based on scores.
     */
    static class PlayerScore implements Comparable<PlayerScore> {
        String name;
        int score;

        public PlayerScore(String name, int score) {
            this.name = name;
            this.score = score;
        }

        @Override
        public int compareTo(PlayerScore other) {
            // Sort by score in descending order
            if (this.score != other.score) {
                return Integer.compare(other.score, this.score);
            }
            // If scores are tied, sort alphabetically by player name to ensure both remain in the Set
            return this.name.compareTo(other.name);
        }

        @Override
        public String toString() {
            return name + " (" + score + " pts)";
        }
    }
```

