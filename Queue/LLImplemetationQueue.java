public class LLImplemetationQueue {
    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data=data;
        }
    }

    public static class queueLL{
        Node head=null;
        Node tail=null;
        int size=0; 

        public void add(int x) {
            Node temp=new Node(x);
            if(size==0) {
               head=tail=temp;
            } else {
                tail.next=temp;
                tail=temp;
            }
            size++;
        }

        public int peek() {
            if(size==0) {
                System.out.println("Queue is empty");
                return -1;
            }
         return head.data;
        }

        public int remove() {
            if(size==0) {
                System.out.println("Queue is empty");
                return -1;
            }
            int top=head.data;
            head=head.next;
            size--;
            return top;
        }

        public void display() {
            if(size==0) {
                System.out.println("Queue is empty");
                return ;
            }
            Node temp=head;
            while(temp!=null) {
                System.out.print(temp.data +" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queueLL q=new queueLL();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(7);
         q.display();

         System.out.println(q.peek());
         q.remove();
         q.display();
    }
}
