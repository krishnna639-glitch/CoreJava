import java.util.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

//wed - 
public class practice {
    public static void main(String[] args) {
        // Create a list of strings (fruits)
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // Adding a duplicate to test

        //print list using for loop , enhanced for loop and iterator que 1        
        System.out.println("Using traditional for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }
        
        System.out.println("\nUsing enhanced for loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nUsing iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //remove duplicate element from list que 2
        fruits.remove("Apple");
        System.out.println("After remove: " + fruits);


        //find largest integer in a list of integers que 5
        System.out.println("\nFinding largest integer in a list:");
        List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8);
        int max = numbers.get(0); // Initialize max with the first element
        
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        
        System.out.println("Largest number: " + max);

        //sort a liste of string in a alphabetical order que 6
        System.out.println("\nSorting a list of strings:");
        Collections.sort(fruits);
        System.out.println("Sorted fruits: " + fruits);

        //find perticular element present or not  que 7
        System.out.println("\nFinding a particular element:");
        int target = 8;
        if (numbers.contains(target)) {
            System.out.println(target + " is present in the list.");
        } else {
            System.out.println(target + " is not present in the list.");
        }

        //reverse string or integer list Que 10
        System.out.println("\nReversing the list of fruits:");
        Collections.reverse(fruits);
        System.out.println("Reversed fruits: " + fruits);
        Collections.sort(numbers);
        System.out.println("Sorted numbers: " + numbers);
        Collections.reverse(numbers);
        System.out.println("Reversed numbers: " + numbers);



    }
}
