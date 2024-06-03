import java.util.Stack;

public class PushAtBottomRec {
    
    public static void pushRec(Stack<Integer> st, int x) {
        if(st.size()==0) {
            st.push(x);
            return;
        }
        int top=st.pop();
        pushRec(st, x);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
       System.out.println(st);
       pushRec(st, 50);
       System.out.println(st);
    }
}
