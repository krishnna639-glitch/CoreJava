public class voting {
    public static void main(String[] args) {
        // Declare and initialize variables
        int age = 25;
        int vage = 18; // voting age limit

        // Compare age with voting age
        if (age >= vage) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }
    }
}