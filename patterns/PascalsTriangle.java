public class PascalsTriangle {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            // 1. Print leading spaces for alignment
            for (int s = 0; s < rows - i; s++) {
                System.out.print(" ");
            }

            int number = 1; // The first number in every row is always 1
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                
                // 2. Calculate the next number using the Binomial Coefficient formula
                // next_val = prev_val * (row - col) / (col + 1)
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}