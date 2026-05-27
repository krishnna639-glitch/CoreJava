class Student {
    String name;
    int age;

    // This is the Default (No-Argument) Constructor
    public Student() {
        // Giving variables initial custom default values
        name = "New Student";
        age = 18;
        System.out.println("Default Constructor Called!");
    }
    
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class Default {
    public static void main(String[] args) {
        // When we use 'new Student()', the default constructor runs automatically
        Student student1 = new Student();

        // Let's see the initial values assigned by the constructor
        student1.display();
        
        // Output:
        // Default Constructor Called!
        // Name: New Student, Age: 18
    }
}