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