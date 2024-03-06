import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class MyMain {
    // Example method to calculate the length of a String (without using Optionals)
    public static int calculateLengthWithoutOptional(String str) {
        if (str != null) {
            return str.length();
        } else {
            return 0;
        }
    }

    // Method to calculate the length of a String, using Optional
    // If the String is null, return an empty Optional.
    public static Optional<Integer> calculateLengthWithOptional(String str) {
        return Optional.empty();
    }

    // Method to perform division using Optionals.
    // If the division is by zero, return an empty Optional.
    public static Optional<Double> divide(int dividend, int divisor) {
        return Optional.empty();
    }

    // Method to calculate total price from an array of prices, with optional discount.
    // If the discount is provided, subtract that percent from each price when calculating the total.
    // Use the orElse function!
    public static double calculateTotalPrice(double[] prices, Optional<Double> discountRate) {
        return 0.0;
    }

    // Comparator practice.
    // Method to sort a list of words from shortest to longest length. If two strings have the same length, sort them
    // alphabetically.
    public static void sortByLength(List<String> words) {
    }

    // Streams and Comparators practice.
    // Method to extract the 5 integers that are closest to 100 from a list of ints, sorted by their distance to
    // 100. If two numbers are the same distance, the lower one should be considered closer.
    public static List<Integer> getClosestFiveTo100(List<Integer> numbers) {
        return Collections.emptyList();
    }

    public static void main(String[] args) {
    }
}
