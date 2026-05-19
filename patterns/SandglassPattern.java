public class SandglassPattern {
    public static void main(String[] args) {
        int n = 5;

        // 1. Upper Half (Inverted Pyramid)
        for (int i = 0; i <= n - 1; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = i; k <= n - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2. Lower Half (Regular Pyramid)
        for (int i = n - 1; i >= 0; i--) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = i; k <= n - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}