public class PalindromeCheckerApp{

    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        return isPalindrome(str, 0, str.length() - 1);
    }

    private static boolean isPalindrome(String str, int left, int right) {
        // Skip spaces from left
        while (left < right && str.charAt(left) == ' ') {
            left++;
        }

        // Skip spaces from right
        while (left < right && str.charAt(right) == ' ') {
            right--;
        }

        // Base case
        if (left >= right) {
            return true;
        }

        // Compare characters (case-insensitive)
        if (Character.toLowerCase(str.charAt(left)) !=
                Character.toLowerCase(str.charAt(right))) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
}