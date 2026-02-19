import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String name = scanner.nextLine();
        name = name.toLowerCase();
        int length = name.length();
        boolean isPalindrome = true;
        for (int i=0; i< length/2; i++){
            if(name.charAt(i) != name.charAt(length - 1 -i)){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Is it it a Palindrome?: True");
        }
        else{
            System.out.println("Is it a palindrome?: False");
        }
    }
}
