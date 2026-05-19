public class HalfDiamond {
    public static void main(String[] args) {
        int n = 4; // The maximum number of stars in the middle row

        // 1. Top Half (including the middle row)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2. Bottom Half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}