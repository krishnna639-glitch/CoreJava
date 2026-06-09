// Abstraction in Java is an object-oriented programming concept that hides 
// implementation details and shows only the essential features of an object.

// Think of driving a car:

// You use the steering wheel, brakes, and accelerator.
// You don't need to know how the engine works internally.

// Similarly, abstraction in Java lets users interact with an object without 
// knowing its internal implementation.

// -->Why use abstraction?
// 1 . Reduces complexity
// 2 . Increases security by hiding sensitive details
// 3 . Makes code easier to maintain and extend
// 4 . How is abstraction achieved in Java?

// -->Abstract Classes
// -->Interfaces
// Example using an "Abstract Class"
// abstract class Animal {
//     abstract void makeSound(); // abstract method

//     void sleep() {
//         System.out.println("Sleeping...");
//     }
// }

// class Dog extends Animal {
//     void makeSound() {
//         System.out.println("Bark");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Animal dog = new Dog();
//         dog.makeSound(); // Bark
//         dog.sleep();     // Sleeping...
//     }
// }
// Example using an "Interface"
// interface Vehicle {
//     void start();
// }

// class Car implements Vehicle {
//     public void start() {
//         System.out.println("Car started");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Vehicle car = new Car();
//         car.start();
//     }
// }
// -->Key Difference
// 1 Abstract Class: Can have both abstract and concrete methods.
// 2 Interface: Defines a contract that classes must implement.
// Definition (Interview Style)

// Abstraction is the process of hiding implementation details and exposing 
// only the essential functionality to the user. In Java, it is achieved using abstract classes and interfaces.

// Abstract class
abstract class CoffeeMachine {
    
    // Abstract method: Has NO body. Children MUST define how this works.
    abstract void brewCoffee();

    // Regular method: Children inherit this implementation automatically.
    public void turnOn() {
        System.out.println("Heating up the water boiler...");
    }
}
// Concrete child class
class EspressoMachine extends CoffeeMachine {

    // Implementing the abstract method
    @Override
    void brewCoffee() {
        System.out.println("Grinding beans, applying 9 bars of pressure, and pouring Espresso!");
    }
}
public class sample {
    public static void main(String[] args) {
        // ❌ This would cause an error because CoffeeMachine is abstract:
        // CoffeeMachine machine = new CoffeeMachine();

        //  Create the concrete implementation instead
        CoffeeMachine myMachine = new EspressoMachine();

        // The user only interacts with these simple commands:
        myMachine.turnOn();      // Output: Heating up the water boiler...
        myMachine.brewCoffee();  // Output: Grinding beans, applying 9 bars of pressure...
    }
}