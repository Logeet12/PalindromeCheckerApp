interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

class ReverseStringStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
}

class CharArrayStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {
        char[] arr = input.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

class PalindromeChecker {

    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String input) {
        if (strategy == null) {
            throw new IllegalStateException("Strategy not set!");
        }
        return strategy.isPalindrome(input);
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        PalindromeChecker checker = new PalindromeChecker();
        String word = "madam";

        checker.setStrategy(new ReverseStringStrategy());
        System.out.println("Using Reverse Strategy: " +
                checker.checkPalindrome(word));

        checker.setStrategy(new CharArrayStrategy());
        System.out.println("Using Char Array Strategy: " +
                checker.checkPalindrome(word));
    }
}