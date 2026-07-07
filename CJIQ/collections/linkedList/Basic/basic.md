
# Linked list basic programs 
---

## 1.Create linkedlist and add five elements

```java
import java.util.LinkedList;

public class CreateLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> teams = new LinkedList<>();

        // Adding 5 elements
        teams.add("Ferrari");
        teams.add("McLaren");
        teams.add("Red Bull");
        teams.add("Mercedes");
        teams.add("Aston Martin");

        // Displaying the LinkedList
        System.out.println("LinkedList elements: " + teams);
    }
}

```
---

## 2.Insert element at the begining and end 

```java
        // 1. Insert at the beginning
        teams.addFirst("first");

        // 2. Insert at the end
        teams.addLast("Last");

        System.out.println("Updated List: " + animals);

```
---

## 3.Remove first and last element 

```java
String removeFirst = teams.removeFirst();
print(removeFirst);
String removeLast = teams.removeLast();
print(removeLats);

```
---

## 4.Display all elements using Iterator.

```java
Iterator<String> iterator = teams.iterator();
Print("Displaying iterator :")
while(iterator.hasNext()){
    String car = iterator.next();
    print(car);
}

```


