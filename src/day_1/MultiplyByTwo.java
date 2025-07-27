package day_1;

import java.util.Scanner;

public class MultiplyByTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Multiply by 2 using left shift
        int result = num << 1;

        System.out.println(num + " multiplied by 2 is: " + result);

        sc.close();
    }
}

