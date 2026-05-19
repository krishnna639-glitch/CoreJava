public class PalindromeNumberPattern {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            // 1. Print leading spaces for alignment
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }

            // 2. Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // 3. Print decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println(); // Move to next line
        }
    }
}