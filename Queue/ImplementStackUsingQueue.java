import java.util.*;

public class ImplementStackUsingQueue {
   
    public static class MyStack{
        Queue<Integer> q=new LinkedList<>();

        public void push(int x) {
            q.add(x);
        }

        public int top() {     //peek
          for(int i=0;i<q.size()-1;i++) {
            q.add(q.remove());
          }
          int top=q.peek();
          q.add(q.remove());
          return top;
        }

        public int pop() {
        for(int i=0;i<q.size()-1;i++) {
            q.add(q.remove());
          }
          return q.remove();
        }

        public void display() {
             for(int val:q) {
                System.out.print(val+" ");
             }
            System.out.println();
     }


    }
    public static class MyStack2{
        Queue<Integer> q=new LinkedList<>();

        public void push(int x) {
        if(q.size()==0) q.add(x);
        else {
            q.add(x);
            for(int i=1;i<q.size();i++) {
                q.add(q.remove());
            }
        }
        }

        public int top() {     //peek
          return q.peek();
        }

        public int pop() {
        return q.remove();
        }
     }
       public static void main(String[] args) {
        MyStack st=new MyStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();
        st.pop();
        st.pop();
       st.display();
        System.out.println(st.top());
   }
}