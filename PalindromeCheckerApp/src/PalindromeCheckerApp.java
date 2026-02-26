import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    // Inner Service Class (Encapsulation)
    static class PalindromeChecker {

        // Public method exposed to outside
        public boolean checkPalindrome(String input) {

            if (input == null) {
                return false;
            }

            // Normalize input: remove spaces and convert to lowercase
            String normalized = input.replaceAll("\\s+", "").toLowerCase();

            Stack<Character> stack = new Stack<>();

            // Push characters into stack
            for (char ch : normalized.toCharArray()) {
                stack.push(ch);
            }

            // Compare characters while popping
            for (char ch : normalized.toCharArray()) {
                if (ch != stack.pop()) {
                    return false;
                }
            }

            return true;
        }
    }

    // Main method (User Interaction Layer)
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();

        System.out.println("=== Palindrome Checker App ===");
        System.out.print("Enter a string: ");

        String input = scanner.nextLine();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }

        scanner.close();
    }
}