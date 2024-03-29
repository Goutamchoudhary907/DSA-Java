public class DeleteNode {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static class LinkedList {
        ListNode head = null;
        ListNode tail = null;

        void insertAtEnd(int data) {
            ListNode temp = new ListNode(data);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void deleteNode(ListNode node) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insertAtEnd(5);
        l.insertAtEnd(6);
        l.insertAtEnd(7);

        // Identify the node to delete (e.g., the node with value 6)       // here we can not delete last node 
        ListNode nodeToDelete = l.head.next;

        // Call the deleteNode method
        l.deleteNode(nodeToDelete);

        // Print the updated linked list
        ListNode current = l.head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
