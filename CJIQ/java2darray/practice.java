import java.util.Scanner;
import java.util.Arrays;
class practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        // Taking input for the 2D array
        System.out.println("Enter elements for the first 3x3 matrix:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Printing the 2D array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        //add two matrices
        System.out.println("Enter elements for the second 3x3 matrix:");
        int[][] arr2 = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        // Printing the second 2D array
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        // Adding the two matrices
        //rows = arr.length;
        //cols = arr[0].length;
        int[][] sum = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum[i][j] = arr[i][j] + arr2[i][j];
            }
        }
        // Printing the sum matrix
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        //two matrices are equal or not
        boolean isEqual = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0 ; j < arr[i].length; j++) {
                if (arr[i][j] != arr2[i][j]) {
                    isEqual = false;
                    break;
                }
            }
           
        }
        if (isEqual) {
            System.out.println("The two matrices are equal.");
        } else {
            System.out.println("The two matrices are not equal.");
        }
        //transpose of a matrix
        int[][] transpose = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        // Printing the transpose matrix
        System.out.println("The transpose of the first matrix is:");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        //print boundary elements of a matrix
        System.out.println("Boundary elements of the first matrix:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 || i == arr.length - 1 || j == 0 || j == arr[i].length - 1) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        //interchange first and last row of a matrix
        int temp;
        for (int j = 0; j < arr[0].length; j++) {
            temp = arr[0][j];
            arr[0][j] = arr[arr.length - 1][j];
            arr[arr.length - 1][j] = temp;
        }
        //interchange first and last column of a matrix
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i][0];
            arr[i][0] = arr[i][arr[i].length - 1];
            arr[i][arr[i].length - 1] = temp;
        }
        // find normal and trance of matrix
        int[][] normal = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                normal[i][j] = arr[i][j];
            }
        }                                                       

    }
}