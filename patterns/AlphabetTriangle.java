public class AlphabetTriangle {
    public static void main(String[] args) {
        int rows = 4; // Number of rows to print

        for (int i = 1; i <= rows; i++) {
            char alphabet = 'A'; 
            for (int j = 1; j <= i; j++) {
                System.out.print(alphabet + " ");
                alphabet++; // Move to the next letter
            }
            System.out.println(); // Move to the next line
        }
    }
}