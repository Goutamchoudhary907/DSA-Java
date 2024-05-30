public class PalindromeList {
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

      public static Node copy(Node head) {
        Node temp=head;
        Node p=new Node(0);
        Node newHead=p;
        while(temp!=null) {
        p.next=new Node(temp.data);
        temp=temp.next;
        p=p.next;
        }
        return newHead.next;
      }

      public static boolean palindrome(Node head) {
        Node temp=head;
      Node z=copy(head);
      Node rev=reverseIterator(z);
     Node t=rev;
      while(temp!=null) {
        if(temp.data != t.data) {
        return false;
        }
        temp=temp.next;
        t=t.next;
      }
      return true;
      }
    
      public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(3);
        Node f = new Node(2);
        Node g = new Node(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next=f;
        f.next=g;
        display(a);
       System.out.println(palindrome(a));
}
}