public class ABCD {
    public static class  Node{
        int data;       
        Node next;      
         Node(int data) {         
            this.data=data;
        }
    }
    static void insert(int data, Node head) {
    Node temp=new Node(data);
    Node t=head;
    while(t.next!=null) {
        t=t.next;
    }
    t.next=temp;
    }

    
}
