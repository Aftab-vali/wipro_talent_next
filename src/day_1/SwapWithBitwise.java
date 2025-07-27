package day_1;
import java.util.Scanner;

public class SwapWithBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.println("\nBefore Swapping: a = " + a + ", b = " + b);

        // Swapping using bitwise XOR operator
        a = a ^ b;  // Step 1: XOR and store in a
        b = a ^ b;  // Step 2: XOR new a with b -> original a
        a = a ^ b;  // Step 3: XOR new a with new b -> original b

        System.out.println("After Swapping: a = " + a + ", b = " + b);

        sc.close();
    }
}

