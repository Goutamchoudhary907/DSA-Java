public class LinkedListImplementation {

    public static class Node {         // user defined data type 
        int data;
        Node next;
        Node(int data) {
            this.data=data;
        }
    }
      
    public static class Stack{        // user defined data structure

      Node head=null;
      int size=0; 
      
      void push(int x) {
       Node temp=new Node(x);
       temp.next=head;
       head=temp;
       size++;
      } 

      void displayRec(Node h) {
        if(h==null) return ;
        displayRec(h.next);
        System.out.print(h.data +" ");
      }

      void display() {
         displayRec(head);
        System.out.println();
      }

      int size() {
        return size;
      }

      int pop() {
        if(head==null) {
            System.out.println("Stack is empty");
            return -1;
        } 
        int top=head.data;
        head=head.next;
        return top;
      }

      int peek() {
        if(head==null) {
            System.out.println("Stack is empty");
            return -1;
        }  
        return head.data;
      }

      boolean isEmpty() {
        if(size==0) return true;
        else return false;
      }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(4);
        st.push(5);
        st.push(1);
        st.display();

        System.out.println(st.size());
        st.pop();
        st.display();

        st.push(3);
        st.push(2);
        st.push(1);
        st.push(6);

        st.display();
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        
    }
}
