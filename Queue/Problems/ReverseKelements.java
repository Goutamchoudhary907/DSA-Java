import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKelements {
     public static Queue<Integer> reverse(Queue<Integer> q , int k) {

        Stack<Integer> st=new Stack<>();
         for(int i=0;i<k;i++) {
            st.push(q.remove());
         }

         for(int i=0;i<k;i++) {
            q.add(st.pop());
         }

         for(int i=0;i<q.size()-k;i++) {
            int ele=q.remove();
            q.add(ele);
         }
         return q;
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
       System.out.println(q);
        q=reverse(q,4);
        System.out.println(q);
    }
}
