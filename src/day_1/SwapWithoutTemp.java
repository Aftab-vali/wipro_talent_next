package day_1;

import java.util.Scanner;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.println("\nBefore Swapping: a = " + a + ", b = " + b);

        // Swapping without temporary variable (using arithmetic)
        a = a + b; // sum of both numbers stored in a
        b = a - b; // b becomes original value of a
        a = a - b; // a becomes original value of b

        System.out.println("After Swapping: a = " + a + ", b = " + b);

        sc.close();
    }
}

