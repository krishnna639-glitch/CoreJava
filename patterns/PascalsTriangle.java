public class PascalsTriangle {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            // 1. Print leading spaces for alignment
            for (int s = 0; s < rows - i; s++) { //3 space
                System.out.print(" ");
            }

            int number = 1; // The first number in every row is always 1
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");// 1 --> 1 1 -- > 1 2 1 -- > 1 3 3 1 -- > 1 4 6 4 1
                
                // 2. Calculate the next number using the Binomial Coefficient formula
                // next_val = prev_val * (row - col) / (col + 1)
                number = number * (i - j) / (j + 1); // 1 * (1 - 0) / (0 + 1) = 1 * 1 / 1 = 1
                //
            }
            System.out.println();
        }
    }
}