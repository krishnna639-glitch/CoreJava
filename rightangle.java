public class rightangle {
    public static void main(String[] args) {
        int n = 4; // Number of rows based on the document example

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for columns (stars)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing stars in a row
            System.out.println();
        }
    }
}