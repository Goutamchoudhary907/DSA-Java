public class CriticalPoint {
    public static class Node {
        int data;
        Node next;
        Node prev;
        Node(int data) {
            this.data=data;
        }
    }
    
    public static void print(Node head) {
        Node temp=head;
        while(temp!=null) {
         System.out.print(temp.data+" ");
        temp=temp.next;
        }
        System.out.println();
   }

//    public static int criticalPoint(Node head) {
//     Node temp=head;

//    }
}
