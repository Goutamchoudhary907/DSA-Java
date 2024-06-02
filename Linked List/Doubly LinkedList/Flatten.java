public class Flatten {
    public static class Node {
        int data;
        Node next;
        Node prev;
        Node child;
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

    public static Node flatten(Node head) {
        Node temp=head;
        while (temp!=null) {
            Node t=temp.next;
            if(temp.child!=null) {
             Node c=flatten(temp.child);
             temp.next=c;
             c.prev=temp;
             while (c.next!=null) {
                c=c.next;
             }   
             c.next=t;
           if(t!=null)  t.prev=c;
            }
            temp.child=null;
            temp=t;
        }
        return head;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(13);

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

        Node k=new Node(7);
        Node l=new Node(8);
        Node m=new Node(9);
        Node n=new Node(10);
        c.child=k;
        k.prev=null;
        k.next=l;
        l.next=m;
        l.prev=k;
        m.next=n;
        m.prev=l;
        n.next=null;
        n.prev=m;

        Node r=new Node(11);
        Node s=new Node(12);
        
        l.child=r;
        r.next=s;
        r.prev=null;
        s.next=null;
        s.prev=r;
 
        print(a);
        print(c.child);
        print(l.child);
        Node temp=flatten(a);
        print(temp);

}
}