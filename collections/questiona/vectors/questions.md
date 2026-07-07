# Basic
```
import java.util.Vector;
import java.util.HashSet;
import java.util.Collections;
import java.util.ArrayList;
```

## 1.Create a Vector and add employee names.

```java
    System.out.println("=== 1. Create a Vector and Add Employee Names ===");
        // Create a Vector with an initial capacity of 5
        Vector<String> employeeNames = new Vector<>(5);
        employeeNames.add("Alice");
        employeeNames.add("Bob");
        employeeNames.add("Charlie");
        employeeNames.add("Diana");
        System.out.println("Employee Names Vector: " + employeeNames);
        System.out.println();
```
## 2.Display Vector size and capacity.

```java
    System.out.println("=== 2. Display Vector Size and Capacity ===");
        System.out.println("Current Size: " + employeeNames.size());
        System.out.println("Current Capacity: " + employeeNames.capacity());
        
        // Adding more elements to exceed initial capacity (5) and demonstrate doubling
        employeeNames.add("Evan");
        employeeNames.add("Alice");   // Adding a duplicate for later use
        employeeNames.add("Bob");     // Adding another duplicate for later use
        
        System.out.println("Size after adding more: " + employeeNames.size());
        System.out.println("New Capacity (Doubled): " + employeeNames.capacity());
        System.out.println("Updated Vector: " + employeeNames);
        System.out.println();
```

## 3.Insert an element at a specific position.

```java
    System.out.println("=== 3. Insert an Element at a Specific Position ===");
        // Inserting "Grace" at index 2
        employeeNames.add(2, "Grace");
        System.out.println("Vector after inserting 'Grace' at index 2: " + employeeNames);
        System.out.println();
```

# Intermediate

## 4.Find duplicate elements in a Vector.

```java
    System.out.println("=== 4. Find Duplicate Elements in a Vector ===");
        HashSet<String> uniqueItems = new HashSet<>();
        HashSet<String> duplicates = new HashSet<>();

        for (String name : employeeNames) {
            if (!uniqueItems.add(name)) {
                duplicates.add(name);
            }
        }
        System.out.println("Current Vector: " + employeeNames);
        System.out.println("Duplicate Elements Found: " + duplicates);
        System.out.println();
```

## 5.Sort a Vector of integers.

```java
    System.out.println("=== 5. Sort a Vector of Integers ===");
        Vector<Integer> numbers = new Vector<>();
        numbers.add(45);
        numbers.add(12);
        numbers.add(89);
        numbers.add(34);
        numbers.add(7);
        
        System.out.println("Original Integer Vector: " + numbers);
        Collections.sort(numbers);
        System.out.println("Sorted Integer Vector:   " + numbers);
        System.out.println();
```

## 6.Convert Vector into ArrayList.

```java
    System.out.println("=== 6. Convert Vector into ArrayList ===");
        ArrayList<String> employeeArrayList = new ArrayList<>(employeeNames);
        System.out.println("Converted ArrayList: " + employeeArrayList);
        System.out.println();
```

## 7.Remove all occurrences of a given value.

```java
    System.out.println("=== 7. Remove All Occurrences of a Given Value ===");
        System.out.println("Vector before removal: " + employeeNames);
        String targetToRemove = "Alice";
        
        // Removes all occurrences of "Alice"
        employeeNames.removeAll(Collections.singleton(targetToRemove));
        System.out.println("Vector after removing all occurrences of '" + targetToRemove + "': " + employeeNames);
        System.out.println();
```

## 8.Find maximum and minimum values in Vector.

```java
    System.out.println("=== 8. Find Maximum and Minimum Values in Vector ===");
        System.out.println("Integer Vector: " + numbers);
        int maxVal = Collections.max(numbers);
        int minVal = Collections.min(numbers);
        
        System.out.println("Maximum Value: " + maxVal);
        System.out.println("Minimum Value: " + minVal);
```
