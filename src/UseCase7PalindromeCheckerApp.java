import java.util.*;

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String input = "madam";

        // Create Deque
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for(int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear
        while(deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if(front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if(isPalindrome) {
            System.out.println("The string '" + input + "' is a Palindrome.");
        } else {
            System.out.println("The string '" + input + "' is NOT a Palindrome.");
        }

    }
}
