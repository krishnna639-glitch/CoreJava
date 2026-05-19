public class ContinuousAlphabetPattern {
    public static void main(String[] args) {
        int rows = 4;
        char alphabet = 'A'; // Start with 'A'

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(alphabet);
                alphabet++; // Increment every time a character is printed
            }
            System.out.println(); // Move to next line after each row
        }
    }
}