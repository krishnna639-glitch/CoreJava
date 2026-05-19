public class FloydsTriangle {
    public static void main(String[] args) {
        int n = 4; // Number of rows
        int number = 1; // Starting number

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop to print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++; // Increment the number after printing
            }
            // Move to the next line
            System.out.println();
        }
    }
}