
---

## 1. Linear Search
Iterates sequentially through a collection or array to locate a target element, making it ideal for unsorted data.

```java
import java.util.Scanner;

public class LinearSearch {
    // Method to perform linear search
    public static int performLinearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if the element does not exist
    }

    public static void main(String[] args) {
        int[] data = {34, 78, 12, 90, 45, 23};
        int target = 90;

        int resultIndex = performLinearSearch(data, target);

        if (resultIndex != -1) {
            System.out.println("Element " + target + " found at index: " + resultIndex);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}

```

---

## 2. Binary Search

An optimized $O(\log n)$ search algorithm that works by repeatedly dividing a **sorted** array in half to pinpoint the target value.

```java
public class BinarySearch {
    // Method to perform binary search iteratively
    public static int performBinarySearch(int[] sortedArray, int target) {
        int left = 0;
        int right = sortedArray.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (sortedArray[mid] == target) {
                return mid;
            }

            // If target is greater, ignore left half
            if (sortedArray[mid] < target) {
                left = mid + 1;
            } 
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }
        return -1; // Element was not present
    }

    public static void main(String[] args) {
        // Input array MUST be sorted for Binary Search
        int[] sortedData = {12, 23, 34, 45, 78, 90};
        int target = 23;

        int resultIndex = performBinarySearch(sortedData, target);

        if (resultIndex != -1) {
            System.out.println("Element " + target + " found at sorted index: " + resultIndex);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}

```

---

## 3. Recursively Linearly Search an Element in an Array

Demonstrates how to break down a linear search algorithm using a recursive process rather than a standard loop structure.

```java
public class RecursiveLinearSearch {
    // Recursive method to search for a target element
    public static int searchRecursively(int[] array, int index, int target) {
        // Base Case 1: Element not found if index goes out of bounds
        if (index >= array.length) {
            return -1;
        }
        
        // Base Case 2: Element found at the current index
        if (array[index] == target) {
            return index;
        }
        
        // Recursive step: Move to the next index frame
        return searchRecursively(array, index + 1, target);
    }

    public static void main(String[] args) {
        int[] data = {5, 10, 15, 20, 25};
        int target = 20;

        // Start recursion from the initial index 0
        int resultIndex = searchRecursively(data, 0, target);

        if (resultIndex != -1) {
            System.out.println("Element " + target + " found via recursion at index: " + resultIndex);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}

```

```

```