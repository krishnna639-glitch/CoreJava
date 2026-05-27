// This is the class
class Car {
    // Variables (Attributes/States)
    String color;
    String brand;

    // Method (Behavior)
    void startEngine() {
        System.out.println(brand + " engine started... Vroom!");
    }
}
public class MyCar {
    public static void main(String[] args) {
        // Creating an object named 'myCar' from the Car class
        Car myCar = new Car();

        // Assigning values to the object's variables
        myCar.brand = "Toyota";
        myCar.color = "Red";

        // Accessing the object's method
        myCar.startEngine(); 
        
        // Output: Toyota engine started... Vroom!
    }
}