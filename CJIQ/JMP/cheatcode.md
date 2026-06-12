
---

## 1. The main() Method
Demonstrates the structure of the standard execution entry point in Java and how it processes command-line arguments.

```java
public class MainMethodDemo {
    // The entry point of any standard Java application
    public static void main(String[] args) {
        System.out.println("The main method has started execution.");
        
        // Checking if command-line arguments were passed
        if (args.length > 0) {
            System.out.println("Command-line arguments provided:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + i + ": " + args[i]);
            }
        } else {
            System.out.println("No command-line arguments were provided.");
        }
    }
}

```

---

## 2. Static and Non-Static Methods

Illustrates the difference between methods that belong to the class context (`static`) and methods that require an object instance (`non-static`).

```java
public class MethodTypes {

    // Static method: Can be called without creating an object
    public static void displayStaticMessage() {
        System.out.println("Hello from a Static Method! I belong to the class.");
    }

    // Non-static method: Requires an object instance to be called
    public void displayInstanceMessage() {
        System.out.println("Hello from a Non-Static Method! I belong to an object instance.");
    }

    public static void main(String[] args) {
        // Calling the static method directly
        displayStaticMessage();

        // Calling the non-static method requires instantiation
        MethodTypes obj = new MethodTypes();
        obj.displayInstanceMessage();
    }
}

```

---

## 3. forEach() Method

Demonstrates iterating over collections cleanly using the internal functional `forEach()` loop coupled with lambda expressions or method references.

```java
import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> frameworkList = new ArrayList<>();
        frameworkList.add("Spring Boot");
        frameworkList.add("Hibernate");
        frameworkList.add("Struts");

        System.out.println("--- Iterating using Lambda Expression ---");
        frameworkList.forEach(framework -> System.out.println("Framework: " + framework));

        System.out.println("\n--- Iterating using Method Reference ---");
        frameworkList.forEach(System.out.println);
    }
}

```

---

## 4. toString() Method

Shows how overriding the inheritance-level `Object.toString()` method provides a clean, text-based description of an object's internal state.

```java
class SmartPhone {
    private String brand;
    private String model;

    public SmartPhone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Overriding toString() to return readable textual data instead of a hashcode
    @Override
    public String toString() {
        return "SmartPhone [Brand=" + brand + ", Model=" + model + "]";
    }
}

public class ToStringDemo {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("Google", "Pixel 8");
        
        // Printing the object implicitly or explicitly invokes toString()
        System.out.println("Implicit call: " + phone);
        System.out.println("Explicit call: " + phone.toString());
    }
}

```

---

## 5. codePointAt() Method

Demonstrates using the `String.codePointAt()` built-in helper to retrieve the specific Unicode code point value assigned to a character at a designated text index.

```java
public class CodePointAtDemo {
    public static void main(String[] args) {
        String sequence = "JAVA";
        
        // Retrieve Unicode values for characters in the sequence
        int codePointIndex0 = sequence.codePointAt(0); // Character 'J'
        int codePointIndex2 = sequence.codePointAt(2); // Character 'V'

        System.out.println("Unicode Code Point of '" + sequence.charAt(0) + "' at index 0: " + codePointIndex0);
        System.out.println("Unicode Code Point of '" + sequence.charAt(2) + "' at index 2: " + codePointIndex2);
    }
}

```

---

## 6. compare() Method

Uses standard utility wrapper comparison features (`Integer.compare()`) to compare two primitive data values arithmetically.

```java
public class CompareMethodDemo {
    public static void main(String[] args) {
        int variableA = 15;
        int variableB = 25;
        int variableC = 15;

        // Returns negative value if A < B, 0 if A == B, positive value if A > B
        System.out.println("Comparing A and B (15 vs 25): " + Integer.compare(variableA, variableB));
        System.out.println("Comparing B and A (25 vs 15): " + Integer.compare(variableB, variableA));
        System.out.println("Comparing A and C (15 vs 15): " + Integer.compare(variableA, variableC));
    }
}

```

---

## 7. equals() Method

Highlights the structural difference between verifying identity references (`==`) versus checking logical text value equality via the custom implementation of `equals()`.

```java
public class EqualsMethodDemo {
    public static void main(String[] args) {
        String firstLiteral = "Hello";
        String secondLiteral = "Hello";
        String objectString = new String("Hello");

        // Reference evaluation vs Logical value text evaluation
        System.out.println("Comparing literal references (firstLiteral == secondLiteral): " + (firstLiteral == secondLiteral));
        System.out.println("Comparing instance object references (firstLiteral == objectString): " + (firstLiteral == objectString));
        
        System.out.println("Comparing logical data contents (firstLiteral.equals(objectString)): " + firstLiteral.equals(objectString));
    }
}

```

---

## 8. hasNext() and next() Methods

Shows how to work safely with underlying text sources, parsing items element-by-element using custom `Iterator` collection checks via a `Scanner` interface.

```java
import java.util.Scanner;

public class IteratorScannerDemo {
    public static void main(String[] args) {
        String dataPayload = "Java Programs Collection Reference Documentation";
        Scanner streamScanner = new Scanner(dataPayload);

        System.out.println("Parsing input tokens dynamically:");
        // loop runs as long as there is another token available
        while (streamScanner.hasNext()) {
            String token = streamScanner.next();
            System.out.println("Extracted Token: " + token);
        }
        
        streamScanner.close();
    }
}

```

---

## 9. Multithreading: start() Method

Demonstrates initializing execution threads safely using `Thread.start()`, which prompts the Java Virtual Machine to provision an asynchronous call stack runtime.

```java
class CustomWorkerThread extends Thread {
    @Override
    public void run() {
        System.out.println("Worker execution logic invoked natively inside thread: " + Thread.currentThread().getName());
    }
}

public class StartMethodDemo {
    public static void main(String[] args) {
        CustomWorkerThread processThread = new CustomWorkerThread();
        processThread.setName("Background-Worker-01");

        System.out.println("Invoking start() to schedule thread initialization...");
        // Allocates new call stacks and invokes run() internally asynchronously
        processThread.start();
    }
}

```

---

## 10. Multithreading: run() Method

Contrasts execution by showing that invoking `.run()` manually directly inside user code acts as a normal synchronous method call instead of starting a concurrent background process.

```java
class TaskRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Task logic executing under context: " + Thread.currentThread().getName());
    }
}

public class RunMethodDemo {
    public static void main(String[] args) {
        TaskRunnable taskInstance = new TaskRunnable();
        Thread executionThread = new Thread(taskInstance, "Worker-Thread");

        System.out.println("--- Scenario A: Calling run() directly (Synchronous) ---");
        // This will run inline on the main parent caller stack frame context
        executionThread.run(); 

        System.out.println("\n--- Scenario B: Calling start() correctly (Asynchronous) ---");
        // This creates a proper thread context fork
        executionThread.start();
    }
}

```

```

```