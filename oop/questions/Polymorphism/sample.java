class Animal {
    public void makeSound() {
        System.out.println("The animal makes a generic sound");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof! Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows: Meow! Meow!");
    }
}
public class sample {
    public static void main(String[] args) {
        // Polymorphic reference: Parent type pointing to Child objects
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound(); // Output: The dog barks: Woof! Woof!
        myCat.makeSound(); // Output: The cat meows: Meow! Meow!

        System.out.println("\n--- Processing an array polymorphically ---");
        
        // Storing different kinds of animals in a single Animal array
        Animal[] zoo = { new Dog(), new Cat(), new Animal() };

        for (Animal animal : zoo) {
            animal.makeSound(); 
        }
        /* Output:
        The dog barks: Woof! Woof!
        The cat meows: Meow! Meow!
        The animal makes a generic sound
        */
    }
}