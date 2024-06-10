import java.util.Deque;
import java.util.LinkedList;
public class Dequeue {
    
    public static void main(String[] args) {
        Deque<Integer> dq=new LinkedList<>();
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.addFirst(5);
        System.out.println(dq);

        dq.removeLast();
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);

        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
 
        dq.add(6);
        dq.remove();
        System.out.println(dq);

        // dq.removeAll(dq);      remove everything
    }
}
