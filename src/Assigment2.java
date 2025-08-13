public class Assigment2 {

    public static void main(String[] args) {
        int resultInt = Calculator.powerInt(2, 3);       // 2^3 = 8
        double resultDouble = Calculator.powerDouble(2.5, 3); // 2.5^3

        System.out.println("Result of powerInt: " + resultInt);
        System.out.println("Result of powerDouble: " + resultDouble);
    }
}

class Calculator {

    // Static method for int power
    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    // Static method for double power
    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }
}