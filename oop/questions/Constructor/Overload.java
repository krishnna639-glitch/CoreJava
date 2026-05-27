class Student {
    String name;
    int age;

    // Constructor 1: Default constructor (No arguments)
    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor 2: Overloaded constructor with ONE argument
    public Student(String name) {
        this.name = name;
        this.age = 18; // Default age if not provided
    }

    // Constructor 3: Overloaded constructor with TWO arguments
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class Overload {
    public static void main(String[] args) {
        // 1. Calls the default constructor (Constructor 1)
        Student s1 = new Student();
        
        // 2. Calls the constructor with a String parameter (Constructor 2)
        Student s2 = new Student("Alice");
        
        // 3. Calls the constructor with a String and an int (Constructor 3)
        Student s3 = new Student("Bob", 21);

        // Printing results
        s1.displayDetails(); // Output: Name: Unknown, Age: 0
        s2.displayDetails(); // Output: Name: Alice, Age: 18
        s3.displayDetails(); // Output: Name: Bob, Age: 21
    }
}