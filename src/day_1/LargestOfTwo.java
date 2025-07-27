package day_1;

import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Using ternary operator to find largest
        int largest = (a > b) ? a : b;

        // Output
        System.out.println("The largest number is: " + largest);

        sc.close();
    }
}

