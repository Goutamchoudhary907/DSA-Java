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
    

      public static boolean palindrome2(Node head) {
        Node slow=head;
        Node fast=head;
        while (fast.next !=null && fast.next.next!=null) {
          slow=slow.next;
          fast=fast.next.next;
        }
        Node temp=reverseIterator(slow.next);
        slow.next=temp;

        Node t1=head;
        Node t2=slow.next;

        while (t2!=null) {
          if(t1.data !=t2.data) return false;
          t1=t1.next;
          t2=t2.next;
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
       System.out.println(palindrome2(a));
}
}