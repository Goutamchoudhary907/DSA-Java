import java.util.Stack;
public class MinStack {
    // public class Min{
//     Stack<Integer> st=new Stack<>();
//     Stack<Integer> min=new Stack<>();

//     public void push(int val) {
//         if(st.size()==0) {
//             st.push(val);
//             min.push(val);
//         } else {
//             st.push(val);
//             if(min.peek() < val) min.push(min.peek());
//             else min.push(val);
//         }
//     }
//     public void pop() {
//         st.pop();
//         min.pop();
//     }

//     public int top() {
//         return st.peek();
//     }

//     public int getMin() {
//         return min.peek();
//     }
// }
    // public class MinStack2{
        Stack<Long> st=new Stack<>();
        long min=-1;

        public void push(int val) {
            long x=(long) val;
            if(st.size()==0) {
                st.push(x);
                min=x;
            }
           else  if(x >=min) {
              st.push(x);
            }
            else if (x<min) {
                st.push(2*x-min);
                min=x;
            }
        }

        public void pop() {
            if(st.size()==0) return;
          else if(st.peek() >=min) st.pop();
          else if(st.peek() < min) {
                long old=2*min-st.peek();
                min=old;
                st.pop();
            }
        }

        public int top() {
            if(st.size()==0) return -1;
            long q=st.peek();
            if(q >=min) return (int)q;
            else return (int)min;
        }
        public int getMin() {
            if(st.size() ==0) return -1;
            return (int)min;
        }

        public static void main(String[] args) {
         MinStack obj=new MinStack();
         obj.push(2);
         obj.push(0);
         obj.push(3);
         obj.push(0);
         int min=obj.getMin();
         System.out.println(min);
         obj.pop();
         int min2=obj.getMin();
         System.out.println(min2);
         obj.pop();
         int min3=obj.getMin();
         System.out.println(min3);
         obj.pop();
         int min4=obj.getMin();
         System.out.println(min4);
    }
}