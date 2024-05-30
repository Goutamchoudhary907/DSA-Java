public class ReverseList {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static void display(Node head) {
        while(head !=null) {
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
     }

      public static Node reverse(Node head) {
        if(head.next==null) return head;
        Node newHead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
      }
      
      public static Node reverseIterator(Node head) {
        Node curr=head;
        Node prev=null;
        Node after=null;
        while (curr!=null) {
        after=curr.next;
        curr.next=prev;
        prev=curr;
        curr=after;
        } 
        return prev;
      }
         public static void main(String[] args) {
             Node a = new Node(5);
             Node b = new Node(3);
             Node c = new Node(9);
             Node d = new Node(8);
             Node e = new Node(16);
             Node f = new Node(56);
             Node g = new Node(30);
     
             a.next = b;
             b.next = c;
             c.next = d;
             d.next = e;
             e.next=f;
             f.next=g;
             display(a);
            //  Node h=reverse(a);
            //  display(h);
             Node z=reverseIterator(a);
             display(z);
}
}