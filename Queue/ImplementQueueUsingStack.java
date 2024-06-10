import java.util.Stack;

public class ImplementQueueUsingStack {
    public static class MyQueue{
        Stack<Integer> st=new Stack<>();
        Stack<Integer> rt=new Stack<>();
        
        public void push(int x) {
          st.push(x);
        }
        public int pop() {
            while(st.size()>1) {
               rt.push(st.pop()); 
            }
           int x= st.pop();

            while(rt.size()>0) {
                st.push(rt.pop());
            }
            return x;
        }

        public int peek() {
            while(st.size()>1) {
                rt.push(st.pop()); 
             }
            int x= st.peek();
 
             while(rt.size()>0) {
                 st.push(rt.pop());
             }
             return x;
        }
        public boolean empty() {
            if(st.size()==0) return true;
            else return false;
        }
    }
    public static class MyQueue2{
        Stack<Integer> st=new Stack<>();
        Stack<Integer> rt=new Stack<>();
        
        public void push(int x) {
            if(st.size()==0) {
             st.push(x);
            }
            while (st.size()>0) {
                rt.push(st.pop());
            }
            st.push(x);
            while (rt.size()>0)  {
                st.push(rt.pop());
            }
          
        }
        public int pop() {
            return st.pop();
        }

        public int peek() {
             return st.peek();
        }
        public boolean empty() {
            if(st.size()==0) return true;
            else return false;
        }
    }

}
