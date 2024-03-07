import java.util.Stack;
public class InsertElementAtBottomOfStack {
    static Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
    if(st.empty()) {
        st.push(x);
        return st;
    }
    int top=st.pop();
    insertAtBottom(st, x);
    st.push(top);
    return st;
    }
    public Stack<Integer> insertAtBottom2(Stack<Integer> st, int x) {
        Stack<Integer> s=new Stack<>();
        s.push(x);
        s.addAll(st);
        return s;
    }
}
