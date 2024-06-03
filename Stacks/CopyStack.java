import java.util.Stack;

public class CopyStack {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
       
        System.out.println(st);

        Stack<Integer> rev= new Stack<>();
        while (st.size()>0)  {
          rev.push(st.pop());  
        }
        Stack<Integer> rt= new Stack<>();
        while(rev.size()>0) {
            rt.push(rev.pop());
        }
        System.out.println(rt);
        System.out.println(rev);
        System.out.println(st);
    }
}
