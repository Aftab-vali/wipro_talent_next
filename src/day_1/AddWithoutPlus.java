package day_1;

import java.util.Scanner;

public class AddWithoutPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        // Adding without using '+' operator
        while (b != 0) {
            // Carry will hold common set bits of a and b
            int carry = a & b;

            // Sum of bits where at least one bit is not set
            a = a ^ b;

            // Carry is shifted by one so it can be added
            b = carry << 1;
        }

        // a now contains the result
        System.out.println("Sum = " + a);

        sc.close();
    }
}

