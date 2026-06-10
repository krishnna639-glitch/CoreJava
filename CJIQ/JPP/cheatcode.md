
---

## 1. Right Triangle Star Pattern
Prints a right-angled triangle pointing to the left.

### Code
```java
public class RightTrianglePattern {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

```

### Output

```text
* * * * * * * * * * * * * * * ```

---

## 2. Left Triangle Star Pattern
Prints a right-angled triangle aligned to the right side.

### Code
```java
public class LeftTrianglePattern {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

```

### Output

```text
        * * * * * * * * * * * * * * * ```

---

## 3. Pyramid Star Pattern
Prints a standard centered pyramid.

### Code
```java
public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

```

### Output

```text
    * * * * * * * * * * * * * * * ```

---

## 4. Reverse Pyramid Star Pattern
Prints an inverted centered pyramid.

### Code
```java
public class ReversePyramidPattern {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = rows; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

```

### Output

```text
* * * * * * * * * * * * * * * ```

---

## 5. Upper Star Triangle Pattern
An upper-pointing triangle structure with a dense, flat base.

### Code
```java
public class UpperTrianglePattern {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

```

### Output

```text
    *
   ***
  *****
 *******
*********

```

---

## 6. Mirror Upper Star Triangle Pattern

An inverted triangle filled symmetrically with spacing.

### Code

```java
public class MirrorUpperTrianglePattern {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= rows; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

```

### Output

```text
* * * * * * * * * * * * * * * ```

---

## 7. Downward Triangle Star Pattern
Prints a decreasing right-angled triangle starting from the top-left.

### Code
```java
public class DownwardTrianglePattern {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

```

### Output

```text
* * * * * * * * * * * * * * * ```

---

## 8. Mirror Lower Star Triangle Pattern
An inverted dense triangle filled symmetrically on the alternate side axis.

### Code
```java
public class MirrorLowerTrianglePattern {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

```

### Output

```text
*********
 *******
  *****
   ***
    *

```

---

## 9. Star Pascal's Triangle

A star pattern matching the geometric alignment of Pascal's Triangle combinations.

### Code

```java
public class StarPascalTriangle {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

```

### Output

```text
    * * * * * * * * * * * * * * * ```

---

## 10. Diamond Star Pattern
Combines an upright pyramid and a reverse pyramid to create a clean diamond shape.

### Code
```java
public class DiamondPattern {
    public static void main(String[] args) {
        int rows = 5;
        // Upper Half
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Lower Half
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

```

### Output

```text
    * * * * * * * * * * * * * * * * * * * * * * * * * ```

---

## 11. Square Star Pattern
Prints a solid grid/square of stars based on the given size.

### Code
```java
public class SquarePattern {
    public static void main(String[] args) {
        int size = 5;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

```

### Output

```text
* * * * * * * * * * * * * * * * * * * * * * * * * ```

---

## 12. Pyramid Star Pattern (Alternative Variant)
An alternative math formula approach mapping dense loops to explicit flag boundaries (`2 * i + 1`).

### Code
```java
public class PyramidAlternative {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

```

### Output

```text
    *
   ***
  *****
 *******
*********

```

---

## 13. Spiral Pattern of Numbers

Fills a 2D matrix inward sequentially with numbers in a clockwise winding spiral direction.

### Code

```java
public class SpiralNumberPattern {
    public static void main(String[] args) {
        int n = 4; // Size of 4x4 matrix
        int[][] matrix = new int[n][n];
        int value = 1;
        int minCol = 0, maxCol = n - 1;
        int minRow = 0, maxRow = n - 1;

        while (value <= n * n) {
            for (int i = minCol; i <= maxCol; i++) {
                matrix[minRow][i] = value++;
            }
            minRow++;
            for (int i = minRow; i <= maxRow; i++) {
                matrix[i][maxCol] = value++;
            }
            maxCol--;
            for (int i = maxCol; i >= minCol; i--) {
                matrix[maxRow][i] = value++;
            }
            maxRow--;
            for (int i = maxRow; i >= minRow; i--) {
                matrix[i][minCol] = value++;
            }
            minCol++;
        }

        // Print Matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

```

### Output

```text
1	2	3	4	
12	13	14	5	
11	16	15	6	
10	9	8	7	

```

```

```