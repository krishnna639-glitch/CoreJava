public class InvertedPyramid {
    public static void main(String[] args) {
        int n = 4; // Number of rows

        for (int i = n; i >= 1; i--) {
            // 1. Inner loop for leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // 2. Inner loop for stars 
            // Formula (2 * i - 1) handles the 7, 5, 3, 1 sequence
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}