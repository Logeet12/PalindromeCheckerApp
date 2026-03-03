import java.util.*;

public class PalindromeCheckerApp {

    // Method 1: Reverse String
    public static boolean reverseMethod(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equals(reversed);
    }

    // Method 2: Two Pointer
    public static boolean twoPointerMethod(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method 3: Stack Method
    public static boolean stackMethod(String text) {
        Stack<Character> stack = new Stack<>();

        for (char ch : text.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : text.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Measure Reverse Method
        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(input);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        // Measure Two Pointer Method
        long start2 = System.nanoTime();
        boolean result2 = twoPointerMethod(input);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        // Measure Stack Method
        long start3 = System.nanoTime();
        boolean result3 = stackMethod(input);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;

        System.out.println("\n--- Results ---");
        System.out.println("Reverse Method: " + result1 +
                " | Time: " + time1 + " ns");

        System.out.println("Two Pointer Method: " + result2 +
                " | Time: " + time2 + " ns");

        System.out.println("Stack Method: " + result3 +
                " | Time: " + time3 + " ns");

        sc.close();
    }
}
