import java.util.*;

public class UseCase13PalindromeCheckerApp {

    // Method 1: String Reverse
    public static boolean reverseMethod(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return input.equals(reversed);
    }

    // Method 2: Two Pointer (char array)
    public static boolean twoPointerMethod(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method 3: Stack
    public static boolean stackMethod(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String input = "madam";

        // Reverse Method
        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(input);
        long end1 = System.nanoTime();

        // Two Pointer Method
        long start2 = System.nanoTime();
        boolean result2 = twoPointerMethod(input);
        long end2 = System.nanoTime();

        // Stack Method
        long start3 = System.nanoTime();
        boolean result3 = stackMethod(input);
        long end3 = System.nanoTime();

        // Display Results
        System.out.println("Input: " + input);

        System.out.println("\nReverse Method: " + result1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Two Pointer Method: " + result2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Stack Method: " + result3 +
                " | Time: " + (end3 - start3) + " ns");
    }
}