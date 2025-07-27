package day_1;

import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        char ch = sc.next().charAt(0);

        // Convert to lowercase for easy comparison
        char lowerCh = Character.toLowerCase(ch);

        // Check if it's a vowel
        if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
            System.out.println(ch + " is a vowel.");
        } else if (Character.isLetter(ch)) {
            System.out.println(ch + " is not a vowel.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }

        sc.close();
    }
}

