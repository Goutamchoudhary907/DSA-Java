// Interleave 1st and 2nd half of a queue  if queue is 1 2 3 4 5 6 7 8 
// ans = 1 5 2 6 3 7 4 8 

import java.util.*;

public class InterLeaveHalf {
    
    public static Queue<Integer> interleave(Queue<Integer> q) {
        int n=q.size();
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<n/2;i++) {
            st.push(q.remove());
        }
        while(st.size()>0) {
            q.add(st.pop());
        }
        for(int i=0;i<n/2;i++) {
            st.push(q.remove());
        } 
        while(st.size()>0) {
            q.add(st.pop());
            q.add(q.remove());
        }
        while(q.size()>0) {
            st.push(q.remove());
        }
        while(st.size()>0) {
            q.add(st.pop());
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
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println(q);

        q=interleave(q);
        System.out.println(q);
    }
}
