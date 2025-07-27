package day_1;

import java.util.Scanner;

public class PerfectSquareCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println(num + " is not a perfect square (negative number).");
        } else {
            // Calculate square root
            int sqrt = (int) Math.sqrt(num);

            // Check if square of sqrt equals the number
            if (sqrt * sqrt == num) {
                System.out.println(num + " is a perfect square.");
            } else {
                System.out.println(num + " is NOT a perfect square.");
            }
        }

        sc.close();
    }
}

