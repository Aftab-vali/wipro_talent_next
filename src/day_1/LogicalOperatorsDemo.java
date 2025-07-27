package day_1;

public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        // Logical AND (&&)
        System.out.println("x && y = " + (x && y));   // true AND false → false

        // Logical OR (||)
        System.out.println("x || y = " + (x || y));   // true OR false → true

        // Logical NOT (!)
        System.out.println("!x = " + (!x));           // NOT true → false
        System.out.println("!y = " + (!y));           // NOT false → true

        // Combine with relational operators
        int a = 10, b = 20, c = 30;
        System.out.println("(a < b) && (b < c) = " + ((a < b) && (b < c))); // true && true → true
        System.out.println("(a > b) || (b < c) = " + ((a > b) || (b < c))); // false || true → true
    }
}
