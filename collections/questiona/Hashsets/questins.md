
# Basic

```
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
```

## 1. Add 10 integers to a HashSet.

```java
// 1. Add 10 integers to a HashSet
        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        System.out.println("1. HashSet after adding 10 integers: " + numbers);
```
## 2. Check whether an element exists.

```java
// 2. Check whether an element exists
        int checkElement = 5;
        boolean exists = numbers.contains(checkElement);
        System.out.println("2. Does element " + checkElement + " exist? " + exists);
```
## 3. Remove a specific element.

```java
// 3. Remove a specific element
        int removeElement = 8;
        numbers.remove(removeElement);
        System.out.println("3. HashSet after removing " + removeElement + ": " + numbers);
        System.out.println();


        System.out.println("=== INTERMEDIATE OPERATIONS ===");
        // Setup two sets for Union, Intersection, and Difference
        HashSet<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);

        HashSet<Integer> setB = new HashSet<>();
        setB.add(3);
        setB.add(4);
        setB.add(5);
        setB.add(6);

        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);
```

# Intermediate
## 4. Find union of two HashSets.

```java
// 4. Find union of two HashSets
        HashSet<Integer> unionSet = new HashSet<>(setA);
        unionSet.addAll(setB);
        System.out.println("4. Union of Set A and Set B: " + unionSet);

```
## 5. Find intersection of two HashSets.

```java
// 5. Find intersection of two HashSets
        HashSet<Integer> intersectionSet = new HashSet<>(setA);
        intersectionSet.retainAll(setB);
        System.out.println("5. Intersection of Set A and Set B: " + intersectionSet);
```
## 6. Find difference between two HashSets.

```java
// 6. Find difference between two HashSets (Set A - Set B)
        HashSet<Integer> differenceSet = new HashSet<>(setA);
        differenceSet.removeAll(setB);
        System.out.println("6. Difference (Set A - Set B): " + differenceSet);
```
## 7. Convert HashSet to ArrayList.

```java
// 7. Convert HashSet to ArrayList
        ArrayList<Integer> arrayListFromSet = new ArrayList<>(setA);
        System.out.println("7. Converted ArrayList (from Set A): " + arrayListFromSet);
```
## 8. Remove duplicates from an ArrayList using HashSet.

```java
// 8. Remove duplicates from an ArrayList using HashSet
        ArrayList<String> duplicateList = new ArrayList<>();
        duplicateList.add("Apple");
        duplicateList.add("Banana");
        duplicateList.add("Apple");
        duplicateList.add("Orange");
        duplicateList.add("Banana");
        System.out.println("Original ArrayList with duplicates: " + duplicateList);
        
        HashSet<String> uniqueSet = new HashSet<>(duplicateList);
        duplicateList.clear();
        duplicateList.addAll(uniqueSet);
        System.out.println("8. ArrayList after removing duplicates: " + duplicateList);
        System.out.println();


        System.out.println("=== ADVANCED OPERATIONS ===");
```

# Advanced
## 9. Find first non-repeated character in a string using HashSet.

```java
// 9. Find first non-repeated character in a string using HashSet
        String inputStr = "swiss";
        char firstNonRepeated = findFirstNonRepeatedChar(inputStr);
        System.out.println("9. First non-repeated character in \"" + inputStr + "\": " + firstNonRepeated);
```

## 10. Determine whether two sets are equal.

```java
// 10. Determine whether two sets are equal
        HashSet<String> set1 = new HashSet<>();
        set1.add("Java");
        set1.add("Python");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Python");
        set2.add("Java");

        boolean areEqual = set1.equals(set2);
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("10. Are the two sets equal? " + areEqual);

        /**
     * Helper method to find the first non-repeated character.
     * Uses a Map to track counts and a HashSet variant logic tracking.
     */
    private static char findFirstNonRepeatedChar(String str) {
        Map<Character, Integer> charCounts = new LinkedHashMap<>();
        
        // Count frequencies of each character
        for (char ch : str.toCharArray()) {
            charCounts.put(ch, charCounts.getOrDefault(ch, 0) + 1);
        }
        
        // Find the first character with a count of 1
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0'; // Return null character if none found
    }
```
