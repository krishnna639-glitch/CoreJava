# Basic
```
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.List;
```

## 1. Store city names using LinkedHashSet.

```java
// 1. Store city names using LinkedHashSet
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("New York");
        cities.add("Tokyo");
        cities.add("London");
        cities.add("Paris");
        cities.add("New York"); // Attempting to add a duplicate

        System.out.println("1. Cities in LinkedHashSet: " + cities);
```

## 2. Verify insertion order is maintained.

```java
// 2. Verify insertion order is maintained
        // LinkedHashSet retains elements in the exact order they were inserted, excluding duplicates.
        System.out.println("2. Verification: Does the order match 'New York -> Tokyo -> London -> Paris'?");
        System.out.println("   Actual Order: " + cities);
        System.out.println();


        System.out.println("=== INTERMEDIATE OPERATIONS ===");
```

# Intermediate

## 3. Remove duplicate words from a sentence while maintaining order.

```java
// 3. Remove duplicate words from a sentence while maintaining order
        String sentence = "Java is fun and programming in Java is powerful";
        String[] words = sentence.split(" ");
        
        LinkedHashSet<String> uniqueWords = new LinkedHashSet<>();
        for (String word : words) {
            uniqueWords.add(word);
        }
        
        // Rebuild the sentence without duplicates
        String cleanedSentence = String.join(" ", uniqueWords);
        System.out.println("3. Original Sentence: " + sentence);
        System.out.println("   Cleaned Sentence:  " + cleanedSentence);

        // Setup sets for common elements
        LinkedHashSet<Integer> setA = new LinkedHashSet<>();
        setA.add(10);
        setA.add(20);
        setA.add(30);

        LinkedHashSet<Integer> setB = new LinkedHashSet<>();
        setB.add(20);
        setB.add(30);
        setB.add(40);
```

## 4. Find common elements between two LinkedHashSets.

```java
// 4. Find common elements between two LinkedHashSets
        LinkedHashSet<Integer> commonElements = new LinkedHashSet<>(setA);
        commonElements.retainAll(setB);
        System.out.println("4. Common elements between " + setA + " and " + setB + ": " + commonElements);
```

## 5. Convert LinkedHashSet into List.

```java
// 5. Convert LinkedHashSet into List
        List<String> citiesList = new ArrayList<>(cities);
        System.out.println("5. Converted List: " + citiesList);
        System.out.println();
        System.out.println("=== ADVANCED OPERATIONS ===");
```

# Advanced

## 6. Create a program that stores unique login usernames while preserving registration order.

```java
// 6. Create a program that stores unique login usernames while preserving registration order
        LinkedHashSet<String> registeredUsernames = new LinkedHashSet<>();
        
        // Simulating user registrations
        registerUser("alice99", registeredUsernames);
        registerUser("bob_builder", registeredUsernames);
        registerUser("alice99", registeredUsernames); // Duplicate registration attempt
        registerUser("charlie_pro", registeredUsernames);

        System.out.println("6. Final Registered Users (in order of registration): " + registeredUsernames);
        /**
     * Helper method to simulate username registration check and storage
     */
    private static void registerUser(String username, LinkedHashSet<String> currentUsers) {
        if (currentUsers.add(username)) {
            System.out.println("   Registration successful for: " + username);
        } else {
            System.out.println("   Registration failed! Username '" + username + "' is already taken.");
        }
    }
```
