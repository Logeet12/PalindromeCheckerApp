import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        String inputString = scanner.nextLine();
        String cleanString = inputString.replaceAll("\\s+", "").toLowerCase();

        if (isPalindrome(cleanString)) {
            System.out.println("The input String \"" + inputString + "\" is a palindrome.");
        } else {
            System.out.println("The input String \"" + inputString + "\" is not a palindrome.");
        }
        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            queue.add(ch);
            stack.push(ch);
        }

        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

