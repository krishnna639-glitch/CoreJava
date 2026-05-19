public class controlflow {
    public static void main(String[] args) {
        
        // 1. Using 'if' and 'else' (Decision Making)
        int score = 85;
        System.out.println("--- Score Evaluation ---");
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B"); // This will execute
        } else {
            System.out.println("Grade: C or below");
        }

        // 2. Using 'switch' (Multiple Branches)
        char grade = 'B';
        System.out.println("\n--- Feedback ---");
        switch (grade) {
            case 'A':
                System.out.println("Excellent work!");
                break;
            case 'B':
                System.out.println("Good job!"); 
                break;
            default:
                System.out.println("Keep trying!");
        }

        // 3. Using 'for' loop (Fixed Iterations)
        System.out.println("\n--- Counting Study Hours ---");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Hour " + i + " completed.");
        }

        // 4. Using 'while' loop (Conditional Iterations)
        int energy = 2;
        System.out.println("\n--- Energy Check ---");
        while (energy > 0) {
            System.out.println("Still working... Energy level: " + energy);
            energy--; 
        }
        System.out.println("Time to rest!");
    }
}