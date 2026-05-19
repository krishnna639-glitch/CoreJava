public class SameNumber {
    public static void main(String[] args) {
        int n = 4; // Number of rows shown in the document

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop to print numbers from 1 up to i
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            // Move to the next line
            System.out.println();
        }
    }
}