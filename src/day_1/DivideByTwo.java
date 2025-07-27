package day_1;

import java.util.Scanner;

public class DivideByTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Divide by 2 using right shift
        int result = num >> 1;

        System.out.println(num + " divided by 2 is: " + result);

        sc.close();
    }
}

