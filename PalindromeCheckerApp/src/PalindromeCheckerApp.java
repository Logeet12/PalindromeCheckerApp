public class PalindromeCheckerApp{

    public static boolean isPalindrome(String str) {
        return isPalindrome(str, 0, str.length() - 1);
    }

    private static boolean isPalindrome(String str, int left, int right) {
        // Base case
        if (left >= right) {
            return true;
        }

        // Check mismatch
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        // Recursive step
        return isPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String input = "racecar";

        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}