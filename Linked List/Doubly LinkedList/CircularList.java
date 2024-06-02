public class CircularList {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data) {
            this.data=data;
        }

        public static void print(Node head) { 
            Node temp=head.next;
            System.out.print(head.data+" ");
            while(temp!=head) {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        public static Node deleteHead(Node head) {
            Node temp=head.next;
            temp.prev=head.prev;
           head.prev.next=temp;
           return temp;
        }
        public static void main(String[] args) {
            Node a=new Node(4);
             Node b=new Node(18);
             Node c=new Node(2);
             Node d=new Node(99);
             Node e=new Node(13);
        
               a.prev=e;
               a.next=b;
               b.prev=a;
               b.next=c;
               c.prev=b;
               c.next=d;
               d.prev=c;
               d.next=e;
               e.prev=d;
               e.next=a;
            print(a);
            Node temp=deleteHead(a);
            print(temp);
        }
    }
}
