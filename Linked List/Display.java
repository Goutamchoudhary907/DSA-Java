public class Display {
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
 }

 public static void displayRecursivly(Node head) {
   if(head ==null) return ;
   displayRecursivly(head.next);
   System.out.print(head.data+" ");
 }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
        System.out.println(a.next.next.next.next.data);

        Node temp=a;
        // for(int i=1;i<=5;i++) {
        // System.out.print(temp.data+" ");
        // temp=temp.next;
        // }
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        display(a);
        System.out.println();
        displayRecursivly(a);
     }
}
