public class BasicsLinkedList {
    public static class  Node{
        int data;       //value
        Node next;      //address of next node
        Node(int data) {            // constructor
            this.data=data;
        }
    }
    public static void display(Node head) {
        while(head !=null) {
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
     }

     public static void insertAtEnd(Node head , int data) {
        Node temp =new Node(data);
        Node t= head;
        while (t.next!=null) {
            t=t.next;
        }
        t.next=temp;
     }
    public static void main(String[] args) {
     Node a=new Node(5);
    //  System.out.println(a.next);              // null
     Node b=new Node(3);
     Node c=new Node(9);
     Node d=new Node(8);
     Node e=new Node(16);  
     
     // 5  3 9 8 16
     a.next=b;              // 5 -> 3 9 8 16
    //  System.out.println(a);                   //Basics$Node@28a418fc     This is address of a
    //  System.out.println(a.next);              //Basics$Node@5305068a     This is address present in next of a => which is address of next node => which is b 
    //  System.out.println(b);                   //Basics$Node@5305068a     This is address of b 
    //  System.out.println(c);                   //Basics$Node@1f32e575     This is address of c
    
    // System.out.println(b.data);
    // System.out.println(a.next.data);       // access data of b with using a
   
   b.next=c;            // 5 -> 3 -> 9   8   16
   c.next=d;            // 5 -> 3 -> 9 ->8   16
   d.next=e;            // 5 -> 3 -> 9 ->8 ->16

    display(a);
    insertAtEnd(a,87);
    display(a);
}
}
