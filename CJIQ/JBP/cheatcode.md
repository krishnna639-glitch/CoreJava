Here is a comprehensive Java Basic Programs cheat sheet designed to help you quickly master the core logic behind standard programming tasks. Each snippet focuses cleanly on the essential algorithm, highlighting the exact logic required to solve the problem.

---

## 1. Mathematical Logic & Number Properties

### Check Even or Odd

* **The Logic:** If a number is perfectly divisible by 2 (remainder is 0), it is even. Otherwise, it is odd.
* **Operator used:** Modulo (`%`), which returns the remainder of a division.

```java
int num = 7;
if (num % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}

```

### Find Largest Among 3 Numbers

* **The Logic:** Compare the first number against the other two using a logical AND (`&&`). Repeat down the line.

```java
int a = 10, b = 20, c = 15;

if (a >= b && a >= c) {
    System.out.println(a + " is largest");
} else if (b >= a && b >= c) {
    System.out.println(b + " is largest");
} else {
    System.out.println(c + " is largest");
}

```

### Check Leap Year

* **The Logic:** A year is a leap year if it is divisible by 4, but *not* divisible by 100 unless it is *also* divisible by 400.

```java
int year = 2024;
boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

System.out.println(isLeap ? "Leap Year" : "Not a Leap Year");

```

---

## 2. Iterations & Series (Loops)

### Find Factorial of a Number

* **The Logic:** Multiply the tracking number progressively by every descending integer down to 1 (e.g., $5! = 5 \times 4 \times 3 \times 2 \times 1$).

```java
int num = 5;
long factorial = 1; // Use long to prevent integer overflow

for (int i = 1; i <= num; i++) {
    factorial *= i; // Multiplies: 1*1 -> 1*2 -> 2*3 -> 6*4 -> 24*5
}
System.out.println("Factorial: " + factorial);

```

### Display Prime Numbers from 1 to N

* **The Logic:** A prime number is only divisible by 1 and itself. To test if a number is prime, check if any number from 2 up to its square root ($\sqrt{n}$) divides it evenly.

```java
int n = 20;

for (int num = 2; num <= n; num++) {
    boolean isPrime = true;
    
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            isPrime = false; // Found a factor, not prime
            break; 
        }
    }
    if (isPrime) System.out.print(num + " ");
}

```

### Even Sum of Fibonacci Series Till N

* **The Logic:** Next term is the sum of the previous two terms ($0, 1, 1, 2, 3, 5, 8...$). Check if the current term is even before adding it to your running sum total.

```java
int n = 50; // Upper limit value
int t1 = 0, t2 = 1;
int evenSum = 0;

while (t1 <= n) {
    if (t1 % 2 == 0) {
        evenSum += t1;
    }
    // Calculate next term
    int nextTerm = t1 + t2;
    t1 = t2;
    t2 = nextTerm;
}
System.out.println("Sum of even Fibonacci terms: " + evenSum);

```

---

## 3. Advanced Numerical Properties

### Check Armstrong Number

* **The Logic:** An Armstrong number equals the sum of its own digits raised to the power of the total number of digits (e.g., $153 = 1^3 + 5^3 + 3^3$).

```java
int originalNum = 153, remainder, result = 0;
int temp = originalNum;
int digits = String.valueOf(originalNum).length(); // Count digits

while (temp != 0) {
    remainder = temp % 10;                // Extract last digit
    result += Math.pow(remainder, digits); // Raise to power and add
    temp /= 10;                           // Discard last digit
}

if (result == originalNum) System.out.println("Armstrong Number");
else System.out.println("Not Armstrong");

```

### Check Neon Number

* **The Logic:** A number where the sum of the digits of its *square* is equal to the number itself (e.g., $9 \rightarrow 9^2 = 81 \rightarrow 8 + 1 = 9$).

```java
int num = 9;
int square = num * num; // 81
int sum = 0;

while (square > 0) {
    sum += square % 10; // Extract and add last digit
    square /= 10;       // Discard last digit
}

if (sum == num) System.out.println("Neon Number");
else System.out.println("Not a Neon Number");

```

---

## 4. Basic Financial Math

### Simple Interest

* **Formula:** $\text{SI} = \frac{P \times R \times T}{100}$

```java
double principal = 10000, rate = 5.5, time = 3; // 3 years
double simpleInterest = (principal * rate * time) / 100;

System.out.println("Simple Interest: " + simpleInterest);

```

### Compound Interest

* **Formula:** $\text{CI} = P \times \left(1 + \frac{R}{100}\right)^T - P$

```java
double p = 10000, r = 5.5, t = 3;
double compoundInterest = p * Math.pow((1 + r / 100), t) - p;

System.out.println("Compound Interest: " + compoundInterest);

```

---

## Quick-Glance Logic Guide

| Task | Core Mechanical Operation |
| --- | --- |
| **Isolate Last Digit** | `int lastDigit = num % 10;` |
| **Remove Last Digit** | `num = num / 10;` |
| **Percentage Calculations** | Always cast to or use floats/doubles to prevent division data truncation (`5 / 2 = 2`, but `5.0 / 2 = 2.5`). |
| **Swapping Values (No Temp)** | `a = a + b; b = a - b; a = a - b;` |

For a complete breakdown of additional algorithms, variations, or advanced inputs, check out the comprehensive catalog found on the [GeeksforGeeks Java Programming Examples](https://www.geeksforgeeks.org/java/java-programming-examples/) track.