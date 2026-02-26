import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Check if palindrome
    public boolean isPalindrome() {
        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;

        // Find middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverse(slow);
        Node copySecondHalf = secondHalf;

        Node firstHalf = head;
        boolean palindrome = true;

        while (copySecondHalf != null) {
            if (firstHalf.data != copySecondHalf.data) {
                palindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            copySecondHalf = copySecondHalf.next;
        }

        // Restore original list (optional)
        reverse(secondHalf);

        return palindrome;
    }

    // Reverse linked list
    private Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    // Display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.insert(sc.nextInt());
        }

        System.out.print("Linked List: ");
        list.display();

        if (list.isPalindrome()) {
            System.out.println("The linked list is a Palindrome.");
        } else {
            System.out.println("The linked list is NOT a Palindrome.");
        }

        sc.close();
    }
}