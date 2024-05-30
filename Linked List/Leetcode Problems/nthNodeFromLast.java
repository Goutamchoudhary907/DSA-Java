public class nthNodeFromLast {
    public static class Node{
        int data;
        Node next;
        Node (int data) {
            this.data=data;
        }
    }
    public static int size(Node head) {
        Node temp=head;
        int size=0;
        while(temp!=null) {
         temp=temp.next;
         size++;
        }
        return size;
    }
    public static Node nthNode(Node head, int idx) {
        int n=size(head);
        int m=n-idx+1;
        Node temp=head;
      for(int i=1;i<m;i++) {
        temp=temp.next;
      }
      return temp;
    }

    public static Node nthNode2(Node head, int n) {
        Node slow=head;
        Node fast=head;
        for(int i=0;i<n;i++) {
            fast=fast.next;
        }
        while(fast!=null) {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(5);
        Node c=new Node(7);
        Node d=new Node(10);
        Node e=new Node(1);
        Node f=new Node(15);
         a.next=b;
         b.next=c;
         c.next=d;
         d.next=e;
         e.next=f;
         Node temp=nthNode(a,6);
         Node temp2=nthNode2(a,6) ;
         System.out.println(temp.data);
         System.out.println(temp2.data);  
    }
}
