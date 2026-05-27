// Parent class
class Vehicle {
    String brand = "Generic Vehicle";
    
    public void honk() {
        System.out.println("Beep, beep!");
    }
}
// Child class inheriting from Vehicle
class Car extends Vehicle {
    // Unique attribute just for Cars
    int numberOfDoors = 4; 
    
    // Unique method just for Cars
    public void displayDetails() {
        // We can access 'brand' because we inherited it from Vehicle!
        System.out.println("Brand: " + brand); 
        System.out.println("Doors: " + numberOfDoors);
    }
}
public class sample {
    public static void main(String[] args) {
        // Create an object of the Child class
        Car myCar = new Car();

        // 1. We can call the inherited method from Vehicle
        myCar.honk(); // Output: Beep, beep!

        // 2. We can call the Car's own method
        myCar.displayDetails();
        // Output: 
        // Brand: Generic Vehicle
        // Doors: 4
    }
}