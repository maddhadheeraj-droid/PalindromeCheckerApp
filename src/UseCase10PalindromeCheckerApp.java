public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string (with spaces and mixed case)
        String input = "Madam In Eden Im Adam";

        // Step 1: Normalize string
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Reverse normalized string
        String reversed = "";

        for(int i = normalized.length() - 1; i >= 0; i--) {
            reversed = reversed + normalized.charAt(i);
        }

        // Step 3: Compare
        if(normalized.equals(reversed)) {
            System.out.println("The string '" + input + "' is a Palindrome (ignoring spaces & case).");
        } else {
            System.out.println("The string '" + input + "' is NOT a Palindrome.");
        }

    }
}