// Strategy Interface
interface PalindromeStrategy {
    boolean check(String text);
}

// Strategy 1: Reverse String Method
class ReverseStrategy implements PalindromeStrategy {
    public boolean check(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equals(reversed);
    }
}

// Strategy 2: Two Pointer Method
class TwoPointerStrategy implements PalindromeStrategy {
    public boolean check(String text) {
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
}

// Main Class
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        // Using Reverse Strategy
        PalindromeStrategy strategy1 = new ReverseStrategy();
        System.out.println("Reverse Strategy: " + strategy1.check(word));

        // Using Two Pointer Strategy
        PalindromeStrategy strategy2 = new TwoPointerStrategy();
        System.out.println("Two Pointer Strategy: " + strategy2.check(word));
    }
}