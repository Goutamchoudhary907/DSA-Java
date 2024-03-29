public class Implementation {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
        public static class linkedList {
        Node head=null;
        Node tail=null;
        int size=0;  

        void insertAtEnd(int data) {        // TC=O(1)
            Node temp=new Node(data);
            if(head==null) {
                head=temp;
            } else{
                tail.next=temp;
            }
            tail=temp;
            size++;                       // use this to increase size every time you insert element 
                                          // by this we can calculate size in O(1) 
        } 

        void insertAtBegin(int data) {      // TC=O(1)
            Node temp=new Node(data);
            if(head==null) {
               head =tail=temp; 
          //     insertAtEnd(data);   we can do this because in empty list end and start is same 
            } else {
                temp.next=head;
                head=temp;
            }
            size++;
        }

        void inserAt(int idx,int data) {        //TC= O(n)  SC=O(1)
            Node t=new Node(data);
            Node temp=head;
            if(idx==size()) {
               insertAtEnd(data); 
               return;
            } else if(idx==0) {
               insertAtBegin(data);
               return; 
            } else if(idx<0 || idx>size()) {
                System.out.println("Wrong index");
                return;
            }
            for(int i=0;i<idx-1;i++) {
               temp=temp.next; 
            }
           t.next=temp.next;
           temp.next=t; 
           size++;
        }

        int getElementAt(int idx) {            // TC=O(n)
            if(idx<0 || idx>size()) {
                System.out.println("Wrong index");
                return -1;
            }
            Node temp=head;
           for(int i=0;i<idx;i++) {
            temp=temp.next;
           }
           return temp.data;
        }

        void deleteAtIndex(int idx) {
            if(idx<0 || idx>size()) {
                System.out.println("wrong index");
                return;
            } else if(idx==0) {
                head=head.next;
                size--;
                return;
            }
            Node temp=head;
            for(int i=1;i<idx;i++) {
                temp=temp.next;
            }
           temp.next= temp.next.next;
           if(idx==size()) {
            tail=temp;
           }
           size--;
        }
      
        void print() {
            Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        }

        int size() {                   // TC=O(n)
            Node temp=head;
            int count=0;
            while(temp!=null) {
                count ++;
                temp=temp.next;
            }
            return count;
        }
    }
        public static void main(String[] args) {
            linkedList l=new linkedList();
            l.insertAtEnd(4);
            l.insertAtEnd(5);
            l.print(); 
            // System.out.println("Size:"+l.size());
            l.insertAtEnd(6);
            l.print();
            l.insertAtBegin(100);
            l.print();
            l.inserAt(4, 10);
            l.print();
            // System.out.println(l.tail.data);
            l.inserAt(0, 13);
            l.print();
            int a=l.getElementAt(1);
            System.out.println(a);
            System.out.println(l.size);

            l.print();
            l.deleteAtIndex(0);
            l.print();
            System.out.println(l.tail.data);

        }
    }
