import java.util.Stack;
public class Remove {
    
    public static Stack<Integer> delete(Stack<Integer> st , int idx) {
    
        Stack<Integer> rt=new Stack<>();
        while(st.size() >idx+1) {
            rt.push(st.pop());
        }
        st.pop();
        while (rt.size()>0) {
          st.push(rt.pop());  
        }
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
      
        System.out.println(delete(st, 0));

    }
}
