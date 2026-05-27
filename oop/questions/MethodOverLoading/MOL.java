class Calculator {
    
    // Method 1: Adds two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method 2: Overloaded to add THREE integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Overloaded to handle decimal values (doubles)
    public double add(double a, double b) {
        return a + b;
    }
}
public class MOL {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // 1. Calls the method with 2 integer parameters
        int result1 = calc.add(5, 10);
        System.out.println("5 + 10 = " + result1); // Output: 15

        // 2. Calls the method with 3 integer parameters
        int result2 = calc.add(5, 10, 20);
        System.out.println("5 + 10 + 20 = " + result2); // Output: 35

        // 3. Calls the method with 2 double parameters
        double result3 = calc.add(2.5, 3.5);
        System.out.println("2.5 + 3.5 = " + result3); // Output: 6.0
    }
}