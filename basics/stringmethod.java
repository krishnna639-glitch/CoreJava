import java.util.Scanner;

public class stringmethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a boolean value: ");
        boolean boolVal = sc.nextBoolean();

        System.out.print("Enter a byte value: ");
        byte byteVal = sc.nextByte();

        System.out.print("Enter a short value: ");
        short shortVal = sc.nextShort();

        System.out.print("Enter an int value: ");
        int intVal = sc.nextInt();

        System.out.print("Enter a long value: ");
        long longVal = sc.nextLong();

        System.out.print("Enter a float value: ");
        float floatVal = sc.nextFloat();

        System.out.print("Enter a double value: ");
        double doubleVal = sc.nextDouble();

        sc.nextLine(); // consume leftover newline

        System.out.print("Enter a full line: ");
        String lineVal = sc.nextLine();

        System.out.print("Enter a single word: ");
        String wordVal = sc.next();

        System.out.println("\n--- Output ---");
        System.out.println("Boolean: " + boolVal);
        System.out.println("Byte: " + byteVal);
        System.out.println("Short: " + shortVal);
        System.out.println("Int: " + intVal);
        System.out.println("Long: " + longVal);
        System.out.println("Float: " + floatVal);
        System.out.println("Double: " + doubleVal);
        System.out.println("Line: " + lineVal);
        System.out.println("Word: " + wordVal);

        sc.close();
    }
}