// given sorted list return nodes if sum of two nodes is equal to target

public class TwoSumDll {
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

   public static void twoSum(Node head , int target) {
    Node h=head;
    Node t=head;

    while(t.next!=null) {
        t=t.next;
    }
    while (h.data <t.data) {
        if(h.data +t.data == target) {
            System.out.print(h.data +" " +t.data);
            break;
        }
        else if(h.data + t.data >target){
            t=t.prev;
        }else {
            h=h.next;
        }
    }
   }
   public static void main(String[] args) {
    Node a = new Node(3);
    Node b = new Node(5);
    Node c = new Node(8);
    Node d = new Node(13);
    Node e = new Node(20);
    Node f = new Node(22);
    Node g = new Node(35);

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
    twoSum(a, 16);
   }
}
