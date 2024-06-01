public class RandomPointers {

    public static class Node {
        int data;
        Node next;
        Node random;
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

     public static void displayRandom(Node head) {
        while(head !=null) {
            if(head.random !=null) {
                System.out.print(head.random.data+" ");
            } else {
                System.out.print("null ");
            }
             head=head.next;
        }
        System.out.println();
     }
    public static  Node copyRandom(Node head) {
        Node head2=new Node(0);
        Node temp2=head2;
        Node temp1=head;

        while(temp1!=null) {
            Node t=new Node(temp1.data);
            temp2.next=t;
            temp2=t;
            temp1=temp1.next;
        }
        head2=head2.next;
        temp2=head2;
        temp1=head;
        
         // alternate connections
     Node temp=new Node(0);
     while(temp1!=null) {
        temp.next=temp1;
        temp1=temp1.next;
        temp=temp.next;

        temp.next=temp2;
        temp2=temp2.next;
        temp=temp.next;
     }
     temp2=head2;
     temp1=head;
   // assign random pointers
  
   while(temp1!=null && temp2!=null) {
    if(temp1.random==null) temp2.random=null;
    else temp2.random=temp1.random.next;
    temp1=temp2.next;
    if(temp1!=null) temp2=temp1.next;
   }
    temp2=head2;
    temp1=head;
  // seperating the lists 
     while (temp1!=null) {
        temp1.next=temp2.next;
        temp1=temp1.next;
        if(temp1==null) break;
        temp2.next=temp1.next;
        if(temp2.next==null) break;
        temp2=temp2.next;
     }
     return head2;
    }

    public static void main(String[] args) {
        Node a = new Node(7);
        Node b = new Node(13);
        Node c = new Node(11);
        Node d = new Node(10);
        Node e = new Node(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        a.random=null;
        b.random=a;
        c.random=e;
        d.random=c;
        e.random=a;
        System.out.println("original list:");
        display(a);
        System.out.println("Random pointers:");
        displayRandom(a);
        Node temp=copyRandom(a);
        System.out.println("Copied list:");
        display(temp);
        System.out.println("copied list random pointers:");
        displayRandom(temp);
}
}