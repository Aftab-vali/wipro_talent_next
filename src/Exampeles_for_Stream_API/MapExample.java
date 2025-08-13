package Exampeles_for_Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Square each number in the list
        List<Integer> squaredNumbers = numbers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());

        System.out.println("Original list: " + numbers);
        System.out.println("Squared numbers: " + squaredNumbers);
        // Output: Squared numbers: [1, 4, 9, 16, 25]
    }
}
