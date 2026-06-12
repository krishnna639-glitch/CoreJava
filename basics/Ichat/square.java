public class square {
    public static void main(String[] args) {
        // Array containing the target numbers
        int[] numbers = {2, 3, 4};
        
        // Loop through each number to calculate and print its square and cube
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            int square = num * num;
            int cube = num * num * num;
            
            // Print the square and cube separated by a space
            System.out.print(square + " " + cube);
            
            // Add a space between groups, but not after the last number
            if (i < numbers.length - 1) {
                System.out.print(" ");
            }
        }
        // Print a new line at the end
        System.out.println();
    }
}