public class PyramidPattern {
    public static void main(String[] args) {
        int n = 4; // Number of levels in the pyramid

        for (int i = 1; i <= n; i++) {
            // 1. Inner loop for leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // 2. Inner loop for stars
            // Using (2 * i - 1) creates the odd number sequence: 1, 3, 5, 7
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}