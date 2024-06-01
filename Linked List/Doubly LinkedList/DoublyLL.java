
public class DoublyLL {
    public static class Node {
        int data;
        Node next;
        Node prev;
        Node (int data) {
            this.data=data;
        }
    }

    public static void display(Node head) {
      Node temp=head;
      while (temp!=null) {
        System.out.print(temp.data+" ");
        temp=temp.next;
      }
      System.out.println();
    }
    public static void displayRev(Node head) {
      Node temp=head;
      while (temp!=null) {
        System.out.print(temp.data+" ");
        temp=temp.prev;
      }
      System.out.println();
    }


    public static void displayRandom(Node random) {
      Node temp=random;
      while (temp.prev!=null) {      // move temp backwards to head
        temp=temp.prev;
      }
      while (temp!=null) {           // now temp is at head
        System.out.print(temp.data+" ");
        temp=temp.next;
      }
      System.out.println();
    }
    
    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(18);
        Node c=new Node(2);
        Node d=new Node(99);
        Node e=new Node(13);

       a.next=b;
       b.prev=a;
       b.next=c;
       c.prev=b;
       c.next=d;
       d.prev=c;
       d.next=e;
       e.prev=d;
 
       display(a);
       displayRev(e);

       displayRandom(d);
    }
}
