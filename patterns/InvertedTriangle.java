public class InvertedTriangle {
    public static void main(String[] args) {
        int n = 4; // Total number of rows

        // Outer loop: starts at 'n' and decreases down to 1
        for (int i = n; i >= 1; i--) {
            // Inner loop: prints 'i' stars for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}