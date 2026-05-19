public class SameAlphabetTriangle {
    public static void main(String[] args) {
        int rows = 4; // Total rows: A, B, C, D
        char alphabet = 'A'; 

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                // Print the same alphabet for the whole row
                System.out.print(alphabet);
            }
            // Move to the next alphabet for the next row
            alphabet++; 
            System.out.println(); // Move to the next line
        }
    }
}