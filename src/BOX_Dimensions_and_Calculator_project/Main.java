package BOX_Dimensions_and_Calculator_project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Dynamic input for Box class
        System.out.println("Enter the width, height, and depth of the box:");
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        double depth = sc.nextDouble();

        Box myBox = new Box(width, height, depth);
        System.out.println("Volume of the box: " + myBox.volume());

        // Dynamic input for Calculator class
        System.out.println("\n=== PowerInt Method ===");
        System.out.print("Enter two integers (base and exponent): ");
        int baseInt = sc.nextInt();
        int expInt = sc.nextInt();
        int resultInt = Calculator.powerInt(baseInt, expInt);
        System.out.println(baseInt + " to the power " + expInt + " is: " + resultInt);

        System.out.println("\n=== PowerDouble Method ===");
        System.out.print("Enter a decimal number (base) and an integer (exponent): ");
        double baseDouble = sc.nextDouble();
        int expDouble = sc.nextInt();
        double resultDouble = Calculator.powerDouble(baseDouble, expDouble);
        System.out.println(baseDouble + " to the power " + expDouble + " is: " + resultDouble);

        sc.close();
    }
}


