import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String input = scanner.nextLine();

        char[] arr = input.toCharArray();
        boolean isPalindrome = true;

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("It is a Palindrome!");
        } else {
            System.out.println("It is NOT a Palindrome!");
        }

        scanner.close();

    }
}
