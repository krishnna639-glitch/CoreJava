//--> Take input from scaner or BufferReader -->remaining same as prog1.java
import java.util.Scanner;

// Steps to Read and Print an Integer using a Scanner

// Import the Scanner class.
// Create a Scanner object to read input.
// Prompt the user for input.
// Read the integer using nextInt().
// Print the integer using System.out.println().

//Read and print integer from user using scanner class 
// Steps that include  1 --> create object of scanner class using new , use system.in to take inout from console
// 2 --> use nextInt() method to read integer from user and store it in variable.
// 3 --> print the integer using System.out.println() method.

public class Prog1 {
    public static void main(String[] args) {
        // Step 1: Create an object of Scanner class
        Scanner obj = new Scanner(System.in);
        
        // Step 2: Read an integer from user
        System.out.print("Enter an integer: ");
        int userInput = obj.nextInt();
        
        // Step 3: Print the integer
        System.out.println("You entered: " + userInput);
        
        // Close the scanner
        obj.close();

        // Check size in Bits
        System.out.println("Size in Bits:  " + Integer.SIZE + " bits");
        
        // Check size in Bytes
        System.out.println("Size in Bytes: " + Integer.BYTES + " bytes");
    }
}