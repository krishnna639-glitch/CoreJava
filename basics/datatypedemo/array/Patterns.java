public class Patterns {
    public static void main(String[] args) {
        
        int n = 5;
        
        for(int i = 1; i <= n; i++) {      // Outer loop - Row
            for(int j = 1; j <= n; j++) {  
                System.out.print("*");
            }
            System.out.println();
        }
    }
}