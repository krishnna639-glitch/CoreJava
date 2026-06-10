Here is the complete source code and logic for the first 5 Java String programs compiled into a structured, copy-pasteable Markdown (`.md`) format.

```markdown
# Java String Programs - Quick Reference

A compilation of essential Java String manipulation programs, covering character extraction, replacement, and reversal techniques.

---

## 1. Get a Character From the Given String
* **Logic:** Use the built-in `charAt(index)` method of the `String` class to retrieve a character at a specific position (0-indexed).

```java
public class GetCharacter {
    public static void main(String[] args) {
        String str = "GeeksforGeeks";
        int index = 5;
        
        // Fetch character at index 5
        char ch = str.charAt(index);
        
        System.out.println("Character at index " + index + " is: " + ch);
    }
}

```

### Output

```text
Character at index 5 is: f

```

---

## 2. Replace a Character at a Specific Index

* **Logic:** Strings are immutable in Java. To alter a character, change the string into a `StringBuilder`, use `setCharAt(index, newChar)`, and convert it back.

```java
public class ReplaceCharacter {
    public static void main(String[] args) {
        String originalStr = "GeeksforGeeks";
        int index = 6;
        char ch = 'O';
        
        // Using StringBuilder for mutability
        StringBuilder sb = new StringBuilder(originalStr);
        sb.setCharAt(index, ch);
        
        String modifiedStr = sb.toString();
        System.out.println("Original String: " + originalStr);
        System.out.println("Modified String: " + modifiedStr);
    }
}

```

### Output

```text
Original String: GeeksforGeeks
Modified String: GeeksfOrGeeks

```

---

## 3. Reverse a String

* **Logic:** Convert the string into a character array, then use a two-pointer approach (or a decrementing loop) to reverse the elements. Alternatively, use `StringBuilder.reverse()`.

```java
public class ReverseString {
    public static void main(String[] args) {
        String str = "JavaProgramming";
        String reversed = "";
        
        // Loop backwards from the end of the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}

```

### Output

```text
Original: JavaProgramming
Reversed: gnimmargorPavaJ

```

---

## 4. Reverse a String Using Stacks

* **Logic:** Leverage the Last-In, First-Out (LIFO) property of a Stack. Push all characters of the string into the stack, then pop them out one by one to reconstruct the reversed string.

```java
import java.util.Stack;

public class ReverseWithStack {
    public static void main(String[] args) {
        String str = "DataStructure";
        Stack<Character> stack = new Stack<>();
        
        // Push all characters onto the stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        
        // Pop characters to build the reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed.toString());
    }
}

```

### Output

```text
Original: DataStructure
Reversed: erutcurtSatad

```

---

## 5. Sort a String

* **Logic:** Convert the string to a character array using `toCharArray()`, apply `Arrays.sort()` to arrange the characters alphabetically, and wrap them back into a new String.

```java
import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String str = "software";
        
        // Convert to char array and sort
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        
        String sortedStr = new String(charArray);
        
        System.out.println("Original String: " + str);
        System.out.println("Sorted String: " + sortedStr);
    }
}

```

### Output

```text
Original String: software
Sorted String: aeforstw

```


```

```


```markdown
# Java String Programs (Part 2: Programs 6-10)

A structured reference guide covering intermediate Java String manipulation tasks, including character swapping, pangram checking, regular expressions, and Unicode handling.

---

## 6. Swapping Pair of Characters
* **Logic:** Convert the string to a character array. Run a loop with a step of 2 (`i += 2`) and swap the element at index `i` with the element at index `i + 1`.

```java
public class SwapPairs {
    public static void main(String[] args) {
        String str = "JavaProgram";
        char[] ch = str.toCharArray();

        // Iterate through the array skipping one element each time
        for (int i = 0; i < ch.length - 1; i += 2) {
            char temp = ch[i];
            ch[i] = ch[i + 1];
            ch[i + 1] = temp;
        }

        String result = new String(ch);
        System.out.println("Original String: " + str);
        System.out.println("Swapped Pairs:   " + result);
    }
}

```

### Output

```text
Original String: JavaProgram
Swapped Pairs:   aJavProrgam

```

---

## 7. Check Whether the Given String is Pangram

* **Logic:** A pangram contains every letter of the alphabet at least once. Use a boolean array of size 26 to mark the presence of each character ('a' through 'z') after converting the input to lowercase.

```java
public class PangramCheck {
    public static boolean isPangram(String str) {
        boolean[] mark = new boolean[26];
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if ('A' <= ch && ch <= 'Z') {
                index = ch - 'A';
            } else if ('a' <= ch && ch <= 'z') {
                index = ch - 'a';
            } else {
                continue; // Skip spaces and punctuation
            }
            mark[index] = true;
        }

        // Return false if any letter is missing
        for (boolean present : mark) {
            if (!present) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        
        if (isPangram(str)) {
            System.out.println('"' + str + "\" is a pangram.");
        } else {
            System.out.println('"' + str + "\" is not a pangram.");
        }
    }
}

```

### Output

```text
"The quick brown fox jumps over the lazy dog" is a pangram.

```

---

## 8. Print First Letter of Each Word Using Regex

* **Logic:** Use Java's `Pattern` and `Matcher` classes. The regular expression `\b[a-zA-Z]` targets any alphabetic character that matches right after a word boundary (`\b`).

```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstLetterRegex {
    public static void main(String[] args) {
        String str = "Geeks for Geeks Java Contributions";
        
        // \b matches word boundaries
        Pattern p = Pattern.compile("\\b[a-zA-Z]");
        Matcher m = p.matcher(str);

        System.out.print("First letters: ");
        while (m.find()) {
            System.out.print(m.group() + " ");
        }
        System.out.println();
    }
}

```

### Output

```text
First letters: G f G J C 

```

---

## 9. Determine the Unicode Code Point at a Given Index

* **Logic:** Use the built-in String method `codePointAt(index)`. Unlike `charAt()`, which yields a basic 16-bit `char` value, this returns the actual Unicode integer value (code point) of the character.

```java
public class UnicodeCodePoint {
    public static void main(String[] args) {
        String str = "Geeks";
        int index = 2; // Character 'e'
        
        int codePoint = str.codePointAt(index);
        
        System.out.println("String: " + str);
        System.out.println("Character at index " + index + " is: " + str.charAt(index));
        System.out.println("Unicode Code Point value: " + codePoint);
    }
}

```

### Output

```text
String: Geeks
Character at index 2 is: e
Unicode Code Point value: 101

```

---

## 10. Remove Leading Zeros From a String

* **Logic:** Keep track of where non-zero characters begin using a pointer loop, then extract a substring from that point onward. Alternatively, use standard regex replacement: `str.replaceFirst("^0+", "")`.

```java
public class RemoveLeadingZeros {
    public static void main(String[] args) {
        String str = "0000123456";
        int i = 0;
        
        // Find the index of the first non-zero character
        while (i < str.length() && str.charAt(i) == '0') {
            i++;
        }
        
        // Substring from the first non-zero element
        String result = (i == str.length()) ? "0" : str.substring(i);
        
        System.out.println("Original String: " + str);
        System.out.println("After removing zeros: " + result);
    }
}

```

### Output

```text
Original String: 0000123456
After removing zeros: 123456

```

---

> **Note:** For deeper explanations, context tracking, or alternative collection-based challenges, check out the complete list of [GeeksforGeeks Java Programming Examples](https://www.geeksforgeeks.org/java/java-programming-examples/).

```

```
```markdown
# Java String Programs (Part 3: Programs 11-15)

A structured reference guide covering standard string comparison techniques, word filtering, and text insertion methods in Java.

---

## 11. Compare Two Strings
* **Logic:** Use the built-in `equals()` method to compare the actual text content of two strings. Avoid using the `==` operator, as it compares memory references (object locations) rather than content.

```java
public class CompareStrings {
    public static void main(String[] args) {
        String str1 = "GeeksforGeeks";
        String str2 = "GeeksforGeeks";
        String str3 = "Java";

        // Content comparison using equals()
        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equals str3: " + str1.equals(str3));
    }
}

```

### Output

```text
str1 equals str2: true
str1 equals str3: false

```

---

## 12. Compare Two Strings Lexicographically

* **Logic:** Use the `compareTo()` method, which compares strings alphabetically based on the Unicode value of each character. It returns `0` if strings are equal, a negative integer if the calling string comes first, and a positive integer if it comes second.

```java
public class LexicographicalCompare {
    public static void main(String[] args) {
        String str1 = "Apple";
        String str2 = "Banana";
        
        int result = str1.compareTo(str2);

        if (result < 0) {
            System.out.println(str1 + " comes before " + str2 + " lexicographically.");
        } else if (result > 0) {
            System.out.println(str1 + " comes after " + str2 + " lexicographically.");
        } else {
            System.out.println("Both strings are lexicographically equal.");
        }
    }
}

```

### Output

```text
Apple comes before Banana lexicographically.

```

---

## 13. Print Even Length Words

* **Logic:** Split the entire sentence into an array of words using the space character `" "` as a delimiter. Loop through the words and print only those whose length modulo 2 equals zero (`length() % 2 == 0`).

```java
public class EvenLengthWords {
    public static void main(String[] args) {
        String sentence = "Hellos Geeks for Geeks glad to meet you";
        
        // Split sentence by whitespace
        String[] words = sentence.split(" ");
        
        System.out.println("Even length words:");
        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }
}

```

### Output

```text
Even length words:
for
glad
to
meet

```

---

## 14. Insert a String into Another String

* **Logic:** Convert the original string into a mutable `StringBuffer` or `StringBuilder`, then leverage the built-in `insert(index, string)` method to place the new text smoothly at the designated 0-indexed position.

```java
public class InsertString {
    public static void main(String[] args) {
        String originalStr = "GeeksGeeks";
        String strToInsert = "for";
        int index = 5; // Insert after the first "Geeks"

        // Using StringBuffer for insertion
        StringBuffer sb = new StringBuffer(originalStr);
        sb.insert(index + 1, strToInsert); 

        System.out.println("Original String: " + originalStr);
        System.out.println("Modified String: " + sb.toString());
    }
}

```

### Output

```text
Original String: GeeksGeeks
Modified String: GeeksforGeeks

```

---

## 15. Splitting into a Number of Substrings

* **Logic:** Use the `split()` method combined with a limit parameter. Providing a limit restricts the number of times the pattern is applied, thereby controlling the maximum size of the resulting string array.

```java
public class SplitSubstrings {
    public static void main(String[] args) {
        String str = "Java-is-a-programming-language";
        
        // Split with a limit of 3 parts
        String[] chunks = str.split("-", 3);
        
        System.out.println("Splitting with limit = 3:");
        for (int i = 0; i < chunks.length; i++) {
            System.out.println("Part " + i + ": " + chunks[i]);
        }
    }
}

```

### Output

```text
Splitting with limit = 3:
Part 0: Java
Part 1: is
Part 2: a-programming-language

```

---

> **Note:** For more challenges or depth tracking on collections and data structures, look through the full catalog listed on the [GeeksforGeeks Java Programming Examples](https://www.geeksforgeeks.org/java/java-programming-examples/) page.

```

```