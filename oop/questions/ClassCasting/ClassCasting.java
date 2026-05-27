class Animal {
    void makeGenericSound() {
        System.out.println("Some generic animal sound.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Woof! Woof!");
    }
}
public class ClassCasting {
    public static void main(String[] args) {
        
        // --- 1. UPCASTING (Implicit / Automatic) ---
        // We assign a Child object (Dog) to a Parent reference (Animal)
        Animal myAnimal = new Dog(); 
        
        // This works fine because a Dog IS an Animal
        myAnimal.makeGenericSound(); 
        
        // ❌ This would cause a compile error:
        // myAnimal.bark(); 
        // Why? The reference type is 'Animal', and Animals don't know how to bark.


        // --- 2. DOWNCASTING (Explicit) ---
        // To access Dog-specific methods, we must cast the reference back to a Dog
        Dog myDog = (Dog) myAnimal; 
        
        // Now we can successfully call the Child-specific method!
        myDog.bark(); // Output: Woof! Woof!
    }
}