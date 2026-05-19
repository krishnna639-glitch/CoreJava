public class ReverseAlphabetTriangle {
    public static void main(String[] args) {
        int rows = 4; // Total rows to print

        // Outer loop for the number of rows (starting from max and decreasing)
        for (int i = rows; i >= 1; i--) {
            char alphabet = 'A';
            // Inner loop to print characters up to the current row count
            for (int j = 1; j <= i; j++) {
                System.out.print(alphabet);
                alphabet++;
            }
            System.out.println(); // Move to the next line
        }
    }
}