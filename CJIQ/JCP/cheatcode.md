
---

## 1. Binary to Octal
Converts a binary string or number into its octal equivalent.

```java
import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        String binaryStr = sc.nextLine();
        
        // Convert binary to decimal first, then decimal to octal
        int decimal = Integer.parseInt(binaryStr, 2);
        String octalStr = Integer.toOctalString(decimal);
        
        System.out.println("Octal equivalent: " + octalStr);
    }
}

```

---

## 2. Octal to Decimal

Converts a base-8 (octal) number into a base-10 (decimal) number.

```java
import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter octal number: ");
        String octalStr = sc.nextLine();
        
        int decimal = Integer.parseInt(octalStr, 8);
        System.out.println("Decimal equivalent: " + decimal);
    }
}

```

---

## 3. Decimal to Octal

Converts a base-10 (decimal) integer into its base-8 (octal) string representation.

```java
import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int decimal = sc.nextInt();
        
        String octalStr = Integer.toOctalString(decimal);
        System.out.println("Octal equivalent: " + octalStr);
    }
}

```

---

## 4. Hexadecimal to Decimal

Converts a base-16 (hexadecimal) string into its base-10 (decimal) value.

```java
import java.util.Scanner;

public class HexToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hexadecimal string: ");
        String hexStr = sc.nextLine();
        
        int decimal = Integer.parseInt(hexStr, 16);
        System.out.println("Decimal equivalent: " + decimal);
    }
}

```

---

## 5. Decimal to Hexadecimal

Converts a base-10 (decimal) integer into its base-16 (hexadecimal) equivalent.

```java
import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int decimal = sc.nextInt();
        
        String hexStr = Integer.toHexString(decimal).toUpperCase();
        System.out.println("Hexadecimal equivalent: " + hexStr);
    }
}

```

---

## 6. Decimal to Binary

Converts a standard base-10 integer into its base-2 (binary) string format.

```java
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int decimal = sc.nextInt();
        
        String binaryStr = Integer.toBinaryString(decimal);
        System.out.println("Binary equivalent: " + binaryStr);
    }
}

```

---

## 7. Binary to Decimal

Converts a base-2 (binary) string representation into a base-10 integer.

```java
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary string: ");
        String binaryStr = sc.nextLine();
        
        int decimal = Integer.parseInt(binaryStr, 2);
        System.out.println("Decimal equivalent: " + decimal);
    }
}

```

---

## 8. Boolean to String

Demonstrates how to transform a primitive `boolean` or wrapper `Boolean` object into text.

```java
public class BooleanToString {
    public static void main(String[] args) {
        boolean boolVal = true;
        
        // Method 1: Using String.valueOf()
        String str1 = String.valueOf(boolVal);
        
        // Method 2: Using Boolean.toString()
        String str2 = Boolean.toString(boolVal);
        
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
    }
}

```

---

## 9. String to Double

Converts a valid string representation of a decimal number into a primitive `double`.

```java
public class StringToDouble {
    public static void main(String[] args) {
        String str = "123.45";
        
        double doubleVal = Double.parseDouble(str);
        System.out.println("Converted Double: " + doubleVal);
    }
}

```

---

## 10. Double to String

Transforms a decimal floating-point `double` number into its text format.

```java
public class DoubleToString {
    public static void main(String[] args) {
        double doubleVal = 789.10;
        
        String str = String.valueOf(doubleVal);
        System.out.println("Converted String: " + str);
    }
}

```

---

## 11. String to Long

Parses a sequence of numeric characters into a large integer format (`long`).

```java
public class StringToLong {
    public static void main(String[] args) {
        String str = "9876543210";
        
        long longVal = Long.parseLong(str);
        System.out.println("Converted Long: " + longVal);
    }
}

```

---

## 12. Long to String

Converts a large integer (`long`) back into its readable string representation.

```java
public class LongToString {
    public static void main(String[] args) {
        long longVal = 1234567890L;
        
        String str = String.valueOf(longVal);
        System.out.println("Converted String: " + str);
    }
}

```

---

## 13. Int to Char

Converts an integer (representing the ASCII/Unicode point) into its corresponding character literal.

```java
public class IntToChar {
    public static void main(String[] args) {
        int asciiVal = 65; // ASCII value for 'A'
        
        // Typecasting explicitly
        char ch = (char) asciiVal;
        System.out.println("Character representation: " + ch);
        
        // Single digit int to char mapping (e.g., 5 to '5')
        int digit = 5;
        char digitChar = (char) (digit + '0');
        System.out.println("Digit character: " + digitChar);
    }
}

```

---

## 14. Char to Int

Converts a character into its underlying numerical ASCII/Unicode value, or extracts the value of a numeric digit character.

```java
public class CharToInt {
    public static void main(String[] args) {
        char ch = 'A';
        
        // Get ASCII value using implicit casting
        int asciiVal = ch;
        System.out.println("ASCII value of " + ch + " is: " + asciiVal);
        
        // Numeric character value extraction (e.g., '7' to 7)
        char digitChar = '7';
        int numericVal = Character.getNumericValue(digitChar);
        System.out.println("Numeric integer value of '" + digitChar + "' is: " + numericVal);
    }
}

```

```

```