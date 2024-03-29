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
        void insertAtEnd(int data) {
            Node temp=new Node(data);
            if(head==null) {
                head=temp;
            } else{
                tail.next=temp;
            }
            tail=temp; 
        } 
      
        void print() {
            Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        }

        int size() {
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
            System.out.println();
            System.out.println("Size:"+l.size());
        }
    }
