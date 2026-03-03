import java.util.*;

// Strategy Interface
interface PalindromeStrategy {
    boolean check(String text);
}

// Strategy 1: Using Stack
class StackStrategy implements PalindromeStrategy {

    public boolean check(String text) {
        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (char ch : text.toCharArray()) {
            stack.push(ch);
        }

        // Compare with original string
        for (char ch : text.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Strategy 2: Using Deque
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String text) {
        Deque<Character> deque = new ArrayDeque<>();

        // Add characters to deque
        for (char ch : text.toCharArray()) {
            deque.addLast(ch);
        }

        // Compare front and rear
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }
}

// Main Application
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Choose Strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");

        int choice = sc.nextInt();

        PalindromeStrategy strategy;

        // Inject strategy at runtime
        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        boolean result = strategy.check(input);

        if (result) {
            System.out.println("It is a Palindrome ✅");
        } else {
            System.out.println("Not a Palindrome ❌");
        }

        sc.close();
    }
}