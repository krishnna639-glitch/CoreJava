
# Intermediate java program for array list 

## 1. Find the largest number in an ArrayList

```java
 int maxVal = numbers.get(0); // Start with the first element
        for (int num : numbers) {
            if (num > maxVal) {
                maxVal = num; // Update max if a larger number is found
            }
        }
```

## 2 Find the second largest number in an ArrayList.

```java
int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                // Current largest becomes second largest
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                // If num is between largest and second largest
                secondLargest = num;
            }
        }
```

## 3 Remove all duplicate elements from an ArrayList.

```java
// 1. Convert ArrayList to LinkedHashSet to remove duplicates
        LinkedHashSet<Integer> set = new LinkedHashSet<>(numbers);

        // 2. Clear the original list
        numbers.clear();

        // 3. Add the unique elements back to the ArrayList
        numbers.addAll(set);
```

## 4 Reverse

```java
int left = 0;
        int right = numbers.size() - 1;

        while (left < right) {
            // Swap elements at left and right positions
            int temp = numbers.get(left);
            numbers.set(left, numbers.get(right));
            numbers.set(right, temp);

            // Move pointers closer to the center
            left++;
            right--;
        }
```

## 5 Sort an ArrayList in ascending and descending order.

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        numbers.add(15);
        numbers.add(7);
        numbers.add(50);
        numbers.add(23);

        System.out.println("Original list:   " + numbers);

        // 1. Sort in Ascending Order (Smallest to Largest)
        Collections.sort(numbers);
        System.out.println("Ascending order:  " + numbers);

        // 2. Sort in Descending Order (Largest to Smallest)
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending order: " + numbers);
    }
}

```

## 6 Count the frequency of a given element.

```java

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(10);
        numbers.add(40);

        int target = 10; // Element we want to count

        // Approach 1: Using a standard For-Each Loop
        int loopCount = 0;
        for (int num : numbers) {
            if (num == target) {
                loopCount++;
            }
        }
        System.out.println("Frequency of " + target + " (Loop): " + loopCount);

        // Approach 2: Using Built-in Collections Utility
        int builtInCount = Collections.frequency(numbers, target);
        System.out.println("Frequency of " + target + " (Built-in): " + builtInCount);
    }
}

```

## 7 Merge two ArrayLists.

```java

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create the first list
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Alice");
        list1.add("Bob");

        // Create the second list
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Charlie");
        list2.add("Diana");

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        // Approach 1: Merge list2 directly into list1 (Modifies list1)
        list1.addAll(list2);
        System.out.println("\nMerged into List 1: " + list1);

        // Approach 2: Merge into a brand-new combined list (Preserves originals)
        ArrayList<String> freshList1 = new ArrayList<>();
        freshList1.add("Alice");
        freshList1.add("Bob");
        
        ArrayList<String> combinedList = new ArrayList<>(freshList1); // Copy freshList1
        combinedList.addAll(list2);                                   // Add list2
        
        System.out.println("\nMerged into a brand-new list: " + combinedList);
    }
}

```

## 8 Find common elements between two ArrayLists.

```java

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create the first list
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Alice");
        list1.add("Bob");
        list1.add("Charlie");

        // Create the second list
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Bob");
        list2.add("Charlie");
        list2.add("Diana");

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        // Create a copy of list1 to protect the original data
        ArrayList<String> commonElements = new ArrayList<>(list1);

        // Retain only the elements that exist in list2
        commonElements.retainAll(list2);

        System.out.println("Common elements: " + commonElements);
    }
}


```

## 9 Rotate an ArrayList by K positions.

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int k = 2; // Number of positions to rotate

        System.out.println("Original list:        " + numbers);

        // Approach 1: Rotate Right using built-in utility
        ArrayList<Integer> rightRotated = new ArrayList<>(numbers);
        Collections.rotate(rightRotated, k);
        System.out.println("Rotated Right by " + k + ":   " + rightRotated);

        // Approach 2: Rotate Left using negative value
        ArrayList<Integer> leftRotated = new ArrayList<>(numbers);
        Collections.rotate(leftRotated, -k);
        System.out.println("Rotated Left by " + k + ":    " + leftRotated);
    }
}


```

## 10 Convert ArrayList to Array and vice versa.

* convert arraylist into array

```java
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Convert ArrayList to String Array
        String[] array = list.toArray(new String[0]);

        System.out.println("Array Output: " + Arrays.toString(array));
    }
}


```

* convert array to arraylist

```java

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
        
    }
}


```

