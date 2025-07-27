package day_1;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // Using ternary operator
        int largest = (a > b)
                ? (a > c ? a : c)
                : (b > c ? b : c);

        // Output
        System.out.println("The largest number is: " + largest);

        sc.close();
    }
}

