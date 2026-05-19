public class HollowSquare {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) { // Loop for rows
            for (int j = 1; j <= n; j++) { // Loop for columns
                
                // Check if we are on the boundary
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    // Print spaces for the "hollow" part
                    System.out.print("  ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
//predicted outcome 
//***** at the first row and last row all thing is mandatory 
// *   * for 2 to 4 there is only first and last symbol should be print 
// *   *condition c21 and c25 
// *   *
// ***** 