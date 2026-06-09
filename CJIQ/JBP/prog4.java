//swap two number 
// there is two approaches in java to swap two numbers 
//1. using third variable
//2. without using third variable
//3. using bitwise XOR operator (not covered in this code snippet) = R
//4. using multiplication and division (not recommended due to potential overflow issues). = Remaining
//5. using arithmetic operations (addition and subtraction) without a temporary variable (covered in the second approach above). 


//1. using third variable
/*
BEGIN
    NUMBER m = 9
    NUMBER n = 5
    
    PRINT "Before Swap: m = " + m + ", n = " + n
    
    // Step 1: Copy the value of m into a temporary holding variable
    NUMBER temp = m
    
    // Step 2: Assign the value of n to m (m's original value is safe in temp)
    m = n
    
    // Step 3: Assign the saved value from temp to n
    n = temp
    
    PRINT "After Swap: m = " + m + ", n = " + n
END 

Explaination 
1. Take two number from scanner class 
2. Use temporary varuable temp which hold middle position 
3. assign num1 to temp
4. assign num2 to num1  
5. assign temp to num2
6. print the swapped number
*/
import java.util.Scanner;
public class prog4 {
    public static void main(String[] args) {
        // Step 1: Create an object of Scanner class
        Scanner obj = new Scanner(System.in);
        
        // Step 2: Read two numbers from user
        System.out.print("Enter first number: ");
        int num1 = obj.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = obj.nextInt();
        
        // Step 3: Swap the numbers using a third variable
        int temp; // Temporary variable to hold one of the values during swap
        temp = num1; // Store num1 --> in temp 
        num1 = num2; // Assign num2 --> to num1
        num2 = temp; // Assign temp (original num1)--> to num2
        
        // Step 4: Print the swapped numbers
        System.out.println("After swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        
        // Close the scanner
        obj.close();
    }
}

/*
2. without using third variable
import java.util.Scanner;
public class Prog4 {    
    public static void main(String[] args) {
        // Step 1: Create an object of Scanner class
        Scanner obj = new Scanner(System.in);
        
        // Step 2: Read two numbers from user
        System.out.print("Enter first number: ");
        int num1 = obj.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = obj.nextInt();
        
        // Step 3: Swap the numbers without using a third variable
        num1 = num1 + num2; // Step 1: Add num1 and num2 and store in num1
        num2 = num1 - num2; // Step 2: Subtract new num1 (which is sum) by num2 to get original num1 and store in num2
        num1 = num1 - num2; // Step 3: Subtract new num1 (which is sum) by new num2 (original num1) to get original num2 and store in num1
        
        // Step 4: Print the swapped numbers
        System.out.println("After swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        
        // Close the scanner
        obj.close();
    }
}
*/