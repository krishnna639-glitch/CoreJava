//Fetch all primitive data type values from scanner class 
// we have 8 primitive data type , in java there is 7 prebuild scanner class methods 
// to read all primitive data type values from user using scanner class we have to use these methods
// 1. nextInt() --> to read integer value from user
// 2. nextDouble() --> to read double value from user
// 3. nextFloat() --> to read float value from user
// 4. nextLong() --> to read long value from user
// 5. nextBoolean() --> to read boolean value from user
// 6. nextLine() --> to read string value from user
// 7. next() --> to read token from user
// 8. No direct method (Use next().charAt(0)) --> to read char value from user

import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        // Step 1: Create an object of Scanner class
        Scanner obj = new Scanner(System.in);
        
        // Step 2: Read all primitive data type values from user
        System.out.print("Enter an integer: ");
        int intValue = obj.nextInt();
        
        System.out.print("Enter a double: ");
        double doubleValue = obj.nextDouble();
        
        System.out.print("Enter a float: ");
        float floatValue = obj.nextFloat();
        
        System.out.print("Enter a long: ");
        long longValue = obj.nextLong();
        
        System.out.print("Enter a boolean: ");
        boolean booleanValue = obj.nextBoolean();
        
        System.out.print("Enter a string: ");
        String stringValue = obj.next(); // Use next() for single word input
        
        scanner.nextLine(); // Consume the leftover newline
        System.out.print("Enter a string: ");
        String wholeLineStringValue = obj.nextLine(); // Use nextLine() for whole line input
        
        System.out.print("Enter a character: ");
        char charValue = obj.next().charAt(0); // Read a token and get the first character
        
        // Step 3: Print all the values
        System.out.println("You entered integer: " + intValue);
        System.out.println("You entered double: " + doubleValue);
        System.out.println("You entered float: " + floatValue);
        System.out.println("You entered long: " + longValue);
        System.out.println("You entered boolean: " + booleanValue);
        System.out.println("You entered string: " + stringValue);
        System.out.println("You entered whole line string: " + wholeLineStringValue);
        System.out.println("You entered character: " + charValue);
        
        // Close the scanner
        obj.close();
    }
}

/*
=================================================================================
Data Type    | Bits       | Bytes      | Min Value            | Max Value           
=================================================================================
byte         | 8          | 1          | -128                 | 127                 
short        | 16         | 2          | -32768               | 32767               
int          | 32         | 4          | -2147483648          | 2147483647          
long         | 64         | 8          | -9223372036854775808 | 9223372036854775807 
float        | 32         | 4          | 1.401298e-45         | 3.402823e+38        
double       | 64         | 8          | 4.900000e-324        | 1.797693e+308       
char         | 16         | 2          | 0                    | 65535               
=================================================================================
boolean      | 1 bit (virtually managed) | Range: true or false
=================================================================================
*/