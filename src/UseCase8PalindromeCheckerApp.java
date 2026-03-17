class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

public class UseCase8PalindromeCheckerApp {

    // Reverse linked list
    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {

        String input = "madam";

        // Convert string to linked list
        Node head = null, temp = null;

        for (int i = 0; i < input.length(); i++) {
            Node newNode = new Node(input.charAt(i));
            if (head == null) {
                head = newNode;
                temp = head;
            } else {
                temp.next = newNode;
                temp = temp.next;
            }
        }

        // Find middle using fast & slow pointer
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverse(slow);

        // Compare halves
        Node firstHalf = head;
        Node tempSecond = secondHalf;

        boolean isPalindrome = true;

        while (tempSecond != null) {
            if (firstHalf.data != tempSecond.data) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            tempSecond = tempSecond.next;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The string '" + input + "' is a Palindrome.");
        } else {
            System.out.println("The string '" + input + "' is NOT a Palindrome.");
        }
    }
}