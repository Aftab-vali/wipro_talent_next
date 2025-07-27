package day_1;

import java.util.Scanner;

public class OnesComplement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // One's complement using bitwise NOT (~)
        int onesComplement = ~num;

        // Output
        System.out.println("Original number: " + num);
        System.out.println("One's complement: " + onesComplement);

        sc.close();
    }
}

