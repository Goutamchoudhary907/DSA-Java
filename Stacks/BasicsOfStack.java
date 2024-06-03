import java.util.*;
public class BasicsOfStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(23);
        st.push(98);
        st.push(5);

        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st);

        System.out.println("Size:" + st.size());

        while(st.size() >1) {
            st.pop();
        }
        System.out.println(st.peek());

        System.out.println(st.isEmpty()); 
    }
}
