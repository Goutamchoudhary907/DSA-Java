import java.util.LinkedList;
import java.util.Queue;

public class BasicOfQueue {
    public static void main(String[] args) {
        
        Queue<Integer> qe=new LinkedList<>();
        qe.add(1);
        qe.add(2);
        qe.add(3);
        qe.add(4);
        qe.add(5);
        System.out.println(qe);
        qe.remove();
        System.out.println(qe);
        qe.poll();                         // same as remove
        System.out.println(qe);
        System.out.println(qe.element());
        System.out.println(qe.peek());

        System.out.println("Size:" +qe.size());
    }
}
