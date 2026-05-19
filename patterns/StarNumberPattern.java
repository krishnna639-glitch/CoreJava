public class StarNumberPattern {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            // Inner loop to print stars
            // Note: Row 1 has 0 stars, Row 2 has 1 star, etc.
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            // Print the current row number after the stars
            System.out.println(i);
        }
    }
}