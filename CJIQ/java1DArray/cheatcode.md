
---

## 1. Search an Element in an Array
* **Logic:** Perform a Linear Search by iterating through the array and comparing each element with the target key.

```java
public class SearchElement {
    public static int findElement(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i; // Return index if found
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        int key = 4;
        int index = findElement(arr, key);
        System.out.println("Element " + key + " found at index: " + index);
    }
}

```

### Output

```text
Element 4 found at index: 3

```

---

## 2. Find the Largest Element in an Array

* **Logic:** Initialize a variable `max` with the first element, then loop through the array updating `max` whenever a larger element is encountered.

```java
public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 324, 45, 90, 9808};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest element in the array is: " + max);
    }
}

```

### Output

```text
Largest element in the array is: 9808

```

---

## 3. Sort an Array

* **Logic:** Use Java's built-in `Arrays.sort()` utility method to sort the array in ascending order using a Dual-Pivot Quicksort algorithm.

```java
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
        
        Arrays.sort(arr);
        
        System.out.println("Modified array: " + Arrays.toString(arr));
    }
}

```

### Output

```text
Modified array: [6, 7, 9, 13, 21, 45, 101, 102]

```

---

## 4. Sort the Elements of an Array in Descending Order

* **Logic:** To sort primitive arrays in descending order, sort them in ascending order first, then swap the elements from both ends toward the center.

```java
import java.util.Arrays;

public class SortDescending {
    public static void main(String[] args) {
        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
        
        Arrays.sort(arr);
        
        // Reverse the array elements
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        
        System.out.println("Descending array: " + Arrays.toString(arr));
    }
}

```

### Output

```text
Descending array: [102, 101, 45, 21, 13, 9, 7, 6]

```

---

## 5. Sort the Elements of an Array in Ascending Order

* **Logic:** Implement a manual sorting mechanism like Bubble Sort to explicitly demonstrate ascending order sorting without utility libraries.

```java
import java.util.Arrays;

public class BubbleSortAscending {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 1};
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

```

### Output

```text
Sorted array: [1, 2, 5, 7, 8]

```

---

## 6. Remove Duplicate Elements From an Array

* **Logic:** The array must be sorted first. Traverse the array and shift unique elements to the front using an independent index pointer.

```java
import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr, int n) {
        if (n == 0 || n == 1) return n;
        
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n - 1];
        return j; // Return new length of unique elements
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5};
        int newLength = removeDuplicates(arr, arr.length);
        
        System.out.print("Array after unique extraction: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

```

### Output

```text
Array after unique extraction: 1 2 3 4 5 

```

---

## 7. Merge Two Arrays

* **Logic:** Create a third array with a capacity equal to the sum of the lengths of both arrays. Copy the elements of the first array, followed immediately by the elements of the second.

```java
import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        int[] b = {40, 50, 60, 70};
        
        int[] c = new int[a.length + b.length];
        
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        
        System.out.println("Merged array: " + Arrays.toString(c));
    }
}

```

### Output

```text
Merged array: [10, 20, 30, 40, 50, 60, 70]

```

---

## 8. Check if Two Arrays Are Equal or Not

* **Logic:** Check if the lengths are identical. If they are, iterate through the elements simultaneously to ensure corresponding indexes share the exact same value.

```java
public class EqualArrays {
    public static boolean checkEquality(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};
        
        System.out.println("Are arrays equal? " + checkEquality(arr1, arr2));
    }
}

```

### Output

```text
Are arrays equal? true

```

---

## 9. Remove All Occurrences of an Element in an Array

* **Logic:** Loop through the original array and assign values to a tracking element position only if the element does not equal the target removal key.

```java
import java.util.Arrays;

public class RemoveOccurrences {
    public static void main(String[] args) {
        int[] arr = {3, 9, 2, 3, 1, 7, 2, 3};
        int key = 3;
        
        // Count elements that are not the key
        int count = 0;
        for (int val : arr) {
            if (val != key) count++;
        }
        
        int[] result = new int[count];
        int idx = 0;
        for (int val : arr) {
            if (val != key) {
                result[idx++] = val;
            }
        }
        System.out.println("Array after removing " + key + ": " + Arrays.toString(result));
    }
}

```

### Output

```text
Array after removing 3: [9, 2, 1, 7, 2]

```

---

## 10. Find Common Array Elements

* **Logic:** Use nested loops to compare elements of both arrays. Track matched elements or print them immediately when a match occurs.

```java
public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 4, 0};
        int[] arr2 = {0, 2, 12, 1, 14};
        
        System.out.print("Common elements: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }
}

```

### Output

```text
Common elements: 1 2 0 

```

---

## 11. Copy All the Elements of One Array to Another Array

* **Logic:** Initialize a secondary array of the same length and duplicate the references or primitive values element by element via a `for` loop.

```java
import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5};
        int[] destination = new int[source.length];
        
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
        
        System.out.println("Destination Array: " + Arrays.toString(destination));
    }
}

```

### Output

```text
Destination Array: [1, 2, 3, 4, 5]

```

---

## 12. Array Rotation

* **Logic:** To rotate an array left by $d$ elements, copy the first $d$ elements to a temporary array, shift the remaining items forward, and append the temporary elements back at the end.

```java
import java.util.Arrays;

public class ArrayRotation {
    public static void rotateLeft(int[] arr, int d) {
        int n = arr.length;
        int[] temp = new int[d];
        
        // Store first d elements in temp
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        
        // Shift remaining elements
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        
        // Copy temp back to end
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int rotations = 2;
        
        rotateLeft(arr, rotations);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}

```

### Output

```text
Rotated Array: [3, 4, 5, 6, 7, 1, 2]

```

---

> **Note:** For multi-dimensional structures or further data optimization programs, reference the official compilation directory on the [GeeksforGeeks Java Programming Examples](https://www.geeksforgeeks.org/java/java-programming-examples/) index page.

```

```