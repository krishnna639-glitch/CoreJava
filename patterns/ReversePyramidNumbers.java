public class ReversePyramidNumbers {
    public static void main(String[] args) {
        int n = 4; // Total number of rows

        for (int i = 1; i <= n; i++) {
            // 1. Print leading spaces (increases with each row)
            for (int s = 1; s < i; s++) {
                System.out.print(" ");
            }

            // 2. Print numbers starting from i up to n
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }

            System.out.println(); // Move to the next line
        }
    }
}