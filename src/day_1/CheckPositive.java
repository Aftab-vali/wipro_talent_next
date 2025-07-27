package day_1;

import java.util.Scanner;

public class CheckPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println(num + " is positive.");
        } else if (num == 0) {
            System.out.println("The number is zero.");
        } else {
            System.out.println(num + " is not positive (it is negative).");
        }

        sc.close();
    }
}

