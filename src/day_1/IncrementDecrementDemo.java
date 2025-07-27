package day_1;

public class IncrementDecrementDemo {
    public static void main(String[] args) {
        int a = 5;

        System.out.println("Initial value of a = " + a);

        // Post-increment (a++)
        System.out.println("Post-increment (a++): " + (a++)); // prints old value, then increments
        System.out.println("Value of a after post-increment: " + a);

        // Pre-increment (++a)
        System.out.println("Pre-increment (++a): " + (++a));  // increments first, then prints

        // Post-decrement (a--)
        System.out.println("Post-decrement (a--): " + (a--)); // prints old value, then decrements
        System.out.println("Value of a after post-decrement: " + a);

        // Pre-decrement (--a)
        System.out.println("Pre-decrement (--a): " + (--a));  // decrements first, then prints
    }
}

