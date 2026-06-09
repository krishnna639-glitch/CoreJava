class Student {
    // Instance variable (Unique to each student)
    String name; 
    
    // Static variable (Shared across ALL students)
    static String schoolName = "Tech Academy";
    static int studentCount = 0;

    public Student(String name) {
        this.name = name;
        studentCount++; // Increment the shared count every time a new student is born
    }

    // Static Method: Can be called without creating a Student object
    public static void displaySchoolStats() {
        System.out.println("School: " + schoolName);
        System.out.println("Total Students Enrolled: " + studentCount);
        
        // ❌ Note: You cannot access instance variables (like 'name') inside a static method!
        // System.out.println(name); // This would cause a compile error.
    }
}
public class main {
    public static void main(String[] args) {
        // 1. Call the static method directly using the Class Name
        // (We haven't even created an object yet!)
        Student.displaySchoolStats(); 
        System.out.println("-------------------------");

        // 2. Create student objects
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        // 3. Call the static method again to see the updated shared data
        Student.displaySchoolStats();
    }
}