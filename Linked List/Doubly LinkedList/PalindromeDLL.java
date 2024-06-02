public class PalindromeDLL {
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
    public static boolean palindrome(Node head) {
     Node h=head;
     Node t=head;
     while(t.next!=null) {
        t=t.next;
     }
     while (h!=t) {
        if(h.data !=t.data) return false;
        h=h.next;
        t=t.prev;
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
        a.prev=null;
        b.next = c;
        b.prev=a;
        c.next = d;
        c.prev=b;
        d.next = e;
        d.prev=c;
        e.next=f;
        e.prev=d;
        f.next=g;
        f.prev=e;
        g.prev=f;
        g.next=null;

        print(a);
       System.out.println(palindrome(a)) ;

}
}