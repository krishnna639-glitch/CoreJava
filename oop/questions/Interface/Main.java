// The interface
interface Animal {
    // Abstract method (does not have a body)
    void sound(); 
    
    // Another abstract method
    void sleep(); 
}
// Pig "implements" the Animal interface
class Pig implements Animal {
    
    @Override
    public void sound() {
        // The body of sound() is provided here
        System.out.println("The pig says: Wee Wee!");
    }

    @Override
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz...");
    }
}
public class Main {
    public static void main(String[] args) {
        // Create a Pig object using an Animal interface reference
        Animal myPig = new Pig(); 
        
        myPig.sound(); // Output: The pig says: Wee Wee!
        myPig.sleep(); // Output: Zzz...
    }
}