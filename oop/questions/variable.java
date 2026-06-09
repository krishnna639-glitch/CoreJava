
public class variable {
    
    // 1. INSTANCE VARIABLES
    // Declared inside the class but outside any method.
    // They get default values automatically if not initialized.
    String instanceName; // Defaults to null
    int instanceAge;     // Defaults to 0

    public void displayProfile() {
        // 2. LOCAL VARIABLES
        // Declared directly inside a method.
        // They do NOT get default values and MUST be initialized before use.
        String localRole = "Software Engineer"; 
        int localBonus = 5000;
        
        // Accessing Instance Variables (Allowed: Visible throughout the class)
        System.out.println("Name: " + instanceName); 
        System.out.println("Age: " + instanceAge);
        
        // Accessing Local Variables (Allowed: Inside their home method)
        System.out.println("Role: " + localRole);
        System.out.println("Bonus: $" + localBonus);
    }

    public void anotherMethod() {
        // Accessing Instance Variables (Allowed: Still visible here)
        instanceAge = 30; 
        
        // Accessing Local Variables from displayProfile() (NOT Allowed!)
        // System.out.println(localRole); // COMPILER ERROR: localRole cannot be resolved to a variable
    }
}