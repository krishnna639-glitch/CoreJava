public class ReverseNumberTriangle {
    public static void main(String[] args) {
        int n = 4; // Total number of rows

        // Outer loop: starts at 'n' and decreases down to 1
        for (int i = n; i >= 1; i--) {
            // Inner loop: prints numbers from 1 up to the current row count 'i'
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Move to the next line
            System.out.println();
        }
    }
}