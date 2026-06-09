// -->Class casting in Java is the process of converting a reference from one
// type to another within an inheritance hierarchy.

// -->It allows you to treat an object as either its parent type or its child 
// type.

// 1. Upcasting (Child → Parent)

// Upcasting happens automatically when a child object is assigned to a parent
//  reference.

// class Animal {
//     void sound() {
//         System.out.println("Animal sound");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("Bark");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog dog = new Dog();

//         // Upcasting
//         Animal animal = dog;

//         animal.sound();
//     }
// }

// Output:

// Animal sound


// Safe
// Implicit (no cast needed)
// Used for polymorphism

// 2. Downcasting (Parent → Child)
// -->Downcasting converts a parent reference back to a child type.

// Animal animal = new Dog();  // Upcasting

// Dog dog = (Dog) animal;     // Downcasting
// dog.bark();

// Output:

// Bark

// Requires explicit casting
// Can fail at runtime if the object is not actually of that child type

// 3. Invalid Downcasting Example
// Animal animal = new Animal();

// Dog dog = (Dog) animal;  // Runtime error

// Result:
// ClassCastException
// Because the object is an Animal, not a Dog.

// 4. Safe Casting with instanceof
// Use instanceof before downcasting:
// Animal animal = new Dog();

// if (animal instanceof Dog) {
//     Dog dog = (Dog) animal;
//     dog.bark();
// }

// This prevents ClassCastException.

// Real-World Example
// interface Shape { }

// class Circle implements Shape {
//     void drawCircle() {
//         System.out.println("Drawing Circle");
//     }
// }

// Shape shape = new Circle();     // Upcasting

// Circle circle = (Circle) shape; // Downcasting
// circle.drawCircle();

// -->Interview Definition
// Class casting in Java is the conversion of an object reference from one 
// type to another within the same inheritance hierarchy. Upcasting converts a
// child object to a parent reference and is automatic, while downcasting 
// converts a parent reference to a child reference and
// requires explicit casting. Incorrect downcasting can cause a 
// ClassCastException.

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
        // Why? The reference type is 'Animal', and Animals don't know how
        //  to bark.


        // --- 2. DOWNCASTING (Explicit) ---
        // To access Dog-specific methods, we must cast the reference back 
        // to a Dog
        Dog myDog = (Dog) myAnimal; 
        
        // Now we can successfully call the Child-specific method!
        myDog.bark(); // Output: Woof! Woof!
    }
}