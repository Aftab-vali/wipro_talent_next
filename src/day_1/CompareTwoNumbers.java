package day_1;

import java.util.Scanner;

public class CompareTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (n1): ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number (n2): ");
        int n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println(n1 + " is greater than " + n2);
        } else if (n2 > n1) {
            System.out.println(n2 + " is greater than " + n1);
        } else {
            System.out.println("Both numbers are equal.");
        }

        sc.close();
    }
}

