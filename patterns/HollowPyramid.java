public class HollowPyramid {
    public static void main(String[] args) {
        int n = 5; // Height of the pyramid

        for (int i = 1; i <= n; i++) {
            // 1. Print leading spaces for alignment
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // 2. Print stars and hollow center
            for (int k = 1; k <= (2 * i - 1); k++) {
                // Print star only if:
                // - It's the first position in the row (k == 1)
                // - It's the last position in the row (k == 2*i - 1)
                // - It's the bottom row (i == n)
                if (k == 1 || k == (2 * i - 1) || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to next line
        }
    }
}