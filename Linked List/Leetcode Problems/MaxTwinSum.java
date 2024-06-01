public class MaxTwinSum {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
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
      public static Node leftMiddle(Node head) {
        Node slow=head;
        Node fast=head;
  
        while(fast!=null && fast.next.next!=null) {
          slow=slow.next;
          fast=fast.next.next;        
        }
        return slow;
      }

      public static int maxTwin(Node head) {
       Node temp=head;
      Node middle= leftMiddle(temp);
      Node reverse=reverseIterator(middle.next);

      middle.next=reverse;
      int max=Integer.MIN_VALUE;
      Node p1=head;
      Node p2=reverse;

      while (p2!=null) {
      int sum=p1.data +p2.data;
      if(sum > max) {
        max=sum;
      }
      p1=p1.next;
      p2=p2.next;
      }
      return max;
    
      }
      public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(10);
        Node c=new Node(13);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        Node h=new Node(2);

         a.next=b;
         b.next=c;
         c.next=d;
         d.next=e;
         e.next=f;
         f.next=g;
         g.next=h;
     int max=maxTwin(a);
     System.out.println(max);
}
}