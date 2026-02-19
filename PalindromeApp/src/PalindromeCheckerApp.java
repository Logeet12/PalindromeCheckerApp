import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String original = scanner.nextLine();
        original = original.toLowerCase();
        String reversed = "";

        for(int i=original.length()-1; i>=0;i--){
            reversed = reversed + original.charAt(i);
        }
        if(original.equalsIgnoreCase(reversed)){
            System.out.println("Is it a palindrome?: True");
        }
        else{
            System.out.println("Is it a palindrome?: False");
        }
        scanner.close();
    }
}
