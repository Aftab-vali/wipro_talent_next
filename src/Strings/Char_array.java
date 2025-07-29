package Strings;


public class Char_array {
    public static void main(String[] args)
    {
        String str = "Java Exercises.";
// Convert the above string to a char array.
        char[] arr = str.toCharArray();
// Display the contents of the char array.
        for (char i:arr){
            System.out.print(i+", ");
        }

    }
}
