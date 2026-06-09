import java.util.ArrayList;

public class wrraperclass {
    public static void main(String[] args) {
        
        // 1. AUTOBOXING: Converting primitive 'int' to 'Integer' object
        int primitiveInt = 25;
        Integer objectInt = primitiveInt; // Java wraps it automatically
        
        // Why do we need this? 
        // Collections like ArrayList CANNOT hold primitives. They require objects!
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(primitiveInt); // Autoboxed to Integer object behind the scenes
        
        // 2. UNBOXING: Converting 'Integer' object back to primitive 'int'
        Integer anotherObject = 50;
        int anotherPrimitive = anotherObject; // Java unwraps it automatically
        
        // 3. UTILITY METHODS: Wrapper classes provide useful built-in tools
        String numberString = "100";
        // Converting a text string into a mathematical primitive int
        int parsedNumber = Integer.parseInt(numberString); 
        
        System.out.println("Parsed Number: " + parsedNumber);
    }
}
