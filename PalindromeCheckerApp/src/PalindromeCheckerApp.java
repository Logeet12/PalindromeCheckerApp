import java.util.Stack;
import java.util.Scanner;

public class PalindromeCheckerApp{
            public static boolean isPalindrome(String inputString) {

                StringBuilder reverseString = new StringBuilder();
                Stack<Character> stack = new Stack<>();

                String cleanString = inputString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

                for (int i = 0; i < cleanString.length(); i++) {
                    stack.push(cleanString.charAt(i));
                }

                while (!stack.isEmpty()) {
                    reverseString.append(stack.pop());
                }

                return cleanString.equals(reverseString.toString());
            }

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a string to check if it is a palindrome:");
                String input = scanner.nextLine();

                if (isPalindrome(input)) {
                    System.out.println("The input String \"" + input + "\" is a palindrome.");
                } else {
                    System.out.println("The input String \"" + input + "\" is not a palindrome.");
                }

                scanner.close();
            }
}




