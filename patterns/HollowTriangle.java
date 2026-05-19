public class HollowTriangle {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                // Print star only if:
                // 1. It is the first column (j == 1)
                // 2. It is the last column of that row (j == i)
                // 3. It is the last row (i == rows)
                if (j == 1 || j == i || i == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Print space for the "hollow" part
                }
            }
            System.out.println(); // Move to next line
        }
    }
}