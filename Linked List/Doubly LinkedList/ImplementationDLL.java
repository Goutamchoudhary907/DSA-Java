public class ImplementationDLL {

    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data) {
            this.data=data;
        }
    }
    public static void display(Node head) {
        Node temp=head;
        while (temp!=null) {
          System.out.print(temp.data+" ");
          temp=temp.next;
        }
        System.out.println();
      }
    public static Node insertAtHead(Node head, int x) {
     Node t= new Node(x);
     t.next=head;
     head.prev=t;
     head=t;
     return head;
    }

    public static void insertAtTail(Node head,int data) {
        Node temp=head;
        while(temp.next !=null) {
            temp=temp.next;
        }

        Node t=new Node(data);
        temp.next=t;
        t.prev=temp;
    }

    public static void insertAtIdx(Node head ,int idx, int x) {
    Node s=head;

     for(int i=0;i<idx-1;i++) {
        s=s.next;
     }
     Node r=s.next;
     Node t=new Node(x);
     s.next=t;
     t.prev=s;
     t.next=r;
     r.prev=t;
    }
    public static Node deleteAtHead(Node head) {
        Node newHead=head.next;
        if(newHead!=null) newHead.prev=null;
        return newHead;
        }
        public static void deleteAtTail(Node head) {
            Node temp=head;
            while(temp.next!=null && temp.next.next!=null) {
                temp=temp.next;
            }
            temp.next=null;
         }
         public static void deleteTail(Node tail){         // when tail is given
          Node temp=tail;
          temp=temp.prev;
          temp.next=null;
         }


    public static void deleteAtIdx(Node head, int idx) {
        Node temp=head;
        for(int i=0;i<idx-1;i++) {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;
    }
    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(18);
        Node c=new Node(2);
        Node d=new Node(99);
        Node e=new Node(13);

       a.next=b;
       b.prev=a;
       b.next=c;
       c.prev=b;
       c.next=d;
       d.prev=c;
       d.next=e;
       e.prev=d;

       display(a);
      Node n=  insertAtHead(a,100);
       display(n);

        insertAtTail(n, 98);
        display(n);

        insertAtIdx(n, 3, 56);
        display(n);

        deleteAtIdx(n, 2);
        display(n);

      Node temp=  deleteAtHead(n);
        display(temp);

        deleteAtTail(temp);
        display(temp);

        display(a);
       deleteTail(e);
       display(a);
    }
}
