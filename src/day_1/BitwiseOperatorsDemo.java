package day_1;

public class BitwiseOperatorsDemo {
    public static void main(String[] args) {
        int a = 5;   // Binary: 0101
        int b = 3;   // Binary: 0011

        // Bitwise AND
        System.out.println("a & b = " + (a & b));  // 0101 & 0011 = 0001 (1)

        // Bitwise OR
        System.out.println("a | b = " + (a | b));  // 0101 | 0011 = 0111 (7)

        // Bitwise XOR
        System.out.println("a ^ b = " + (a ^ b));  // 0101 ^ 0011 = 0110 (6)

        // Bitwise Complement
        System.out.println("~a = " + (~a));        // Inverts all bits (two's complement)

        // Left shift (a * 2^n)
        System.out.println("a << 1 = " + (a << 1)); // 0101 << 1 = 1010 (10)

        // Right shift (a / 2^n)
        System.out.println("a >> 1 = " + (a >> 1)); // 0101 >> 1 = 0010 (2)
    }
}

