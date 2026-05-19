public class ZigZagPattern {
    public static void main(String[] args) {
        int n = 9; // Number of columns (length of the zig-zag)
        int rows = 3; // Standard height for a basic zig-zag

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= n; j++) {
                // Condition for Zig-Zag:
                // 1. (i+j) is divisible by 4 (for the 'up' strokes)
                // 2. i is 2 and j is divisible by 4 (for the middle row dots)
                if (((i + j) % 4 == 0) || (i == 2 && j % 4 == 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}