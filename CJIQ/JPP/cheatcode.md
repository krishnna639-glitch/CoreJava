
---

## 1. Right Triangle Star Pattern
Prints a right-angled triangle pointing to the left.

```java
public class RightTrianglePattern {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();//to set cursor in next line 
        }
        // if i = 1 --> j = 1 --> print * 
        // i++ --> i = 2 --> j = 1 --> * --> ++ --> j = 2 --> ** 
        
    }
}

```

---

## 2. Left Triangle Star Pattern

Prints a right-angled triangle aligned to the right side.

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
        // i = 1 --> j = 1 on condition <= row (5) - i (1) --> 4 gives 4 space --> k --> 1 run until <= i (1) then print * 
        // final <i> --> <j><k>
    }
}

```

---

## 3. Pyramid Star Pattern

Prints a standard centered pyramid.

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
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //loop structur <i>--><j><k>
        //pyramid - need space and alternative numbers 
        //understand rows if 5 rows style 1 --> 3 --> 5 --> * needed
        //<j> --> condition <= rows(5) - i(1) for " ">
        //<k> --> print alternative numbers where condition is (2 * i(3) - 1) --> 5 * symbol
    }
}

```

---

## 4. Reverse Pyramid Star Pattern

Prints an inverted centered pyramid.

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

---

## 5. Upper Star Triangle Pattern
The "upper star triangle pattern" (often referred to as a right-aligned triangle or half-pyramid) features stars stacked to form a right triangle with its hypotenuse sloping downwards to the left. It requires nested loops: an outer loop for rows, an inner loop for spaces, and an inner loop for stars

```java
public class UpperTrianglePattern {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //just like left star pattern
    }
}

```

---

## 6. Mirror Upper Star Triangle Pattern

Flips the upper star triangle laterally or prints its inverse block complement.
    *****
     ****
      ***
       **
        *


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
        //loop --> <i> --> rows (5)
        //<j> --> space --> condition --> j < i 
        //<k> --> printing --> condition --> k <= rows(5)
        //if i = 1 --> first row
        //      j = 1 --> condition --> j < i --> false 
        //      k = i --> 1 "*" --> condition --> k <= rows(5) --> "*****"
        //i++ i = 2 
        //      j = 1 --> j < i --> by 1 " "
        //      k = 2 --> print " ****"
    }
}

```

---

## 7. Downward Triangle Star Pattern

Prints a decreasing right-angled triangle starting from the top.
A downward star triangle pattern (also known as an inverted left-aligned triangle) starts with a full row of stars at the top and decreases by one star on each row until it reaches a single star at the bottom.
    *****
    ****
    ***
    **
    *


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
        // change for loop for i pattern of right triangle  
    }
}

```

---

## 8. Mirror Lower Star Triangle Pattern

An inverted triangle filled symmetrically on the alternate side axis.

```java
public class MirrorLowerTrianglePattern { // wrong define need to verify 
    public static void main(String[] args) {
        int rows = 5;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

```

---

## 9. Star Pascal's Triangle

A star pattern following the combinations and alignment of Pascal's Triangle.

```java
public class starPascalTriangle {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            int c = 1;
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class PascalsTriangle {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            // 1. Print leading spaces for alignment
            for (int s = 0; s < rows - i; s++) { //3 space
                System.out.print(" ");
            }

            int number = 1; // The first number in every row is always 1
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");// 1 --> 1 1 -- > 1 2 1 -- > 1 3 3 1 -- > 1 4 6 4 1
                
                // 2. Calculate the next number using the Binomial Coefficient formula
                // next_val = prev_val * (row - col) / (col + 1)
                number = number * (i - j) / (j + 1); // 1 * (1 - 0) / (0 + 1) = 1 * 1 / 1 = 1
                //
            }
            System.out.println();
        }
    }
}

```

---

## 10. Diamond Star Pattern

Combines an upright pyramid and a reverse pyramid to create a perfect diamond shape.

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
        //devide half first uper pyramid
        //another half alter one raw by i = raw - 1 of downward pyramid
    }
}

```

---

## 11. Square Star Pattern

Prints a simple grid/square of stars based on the given dimensions.

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

public class HollowSquare {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Print stars only on the edges
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


```

---

## 12. Pyramid Star Pattern (Alternative Variant)

An alternative standard way to map logic cleanly using explicit flag boundaries or single loop iterations for row sizing.

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

---

## 13. Spiral Pattern of Numbers

Prints a matrix of numbers filling inward sequentially in a spiral direction.

```java
public class SpiralNumberPattern { //remaining one 
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

```
*
**
***
****
*****

```