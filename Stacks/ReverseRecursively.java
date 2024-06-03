import java.util.Stack;
public class ReverseRecursively {

    public static void pushRec(Stack<Integer> st, int x) {
        if(st.size()==0) {
            st.push(x);
            return;
        }
        int top=st.pop();
        pushRec(st, x);
        st.push(top);
    }

    
    public static Stack<Integer> reverseRec(Stack<Integer> st) {
     if(st.size()==0) {
        return st;
     } 
     int top=st.pop();
     reverseRec(st);
     pushRec(st, top);
     return st;
    }
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);
       System.out.println(reverseRec(st));
    }
}
