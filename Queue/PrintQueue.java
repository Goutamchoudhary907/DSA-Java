import java.util.LinkedList;
import java.util.Queue;

public class PrintQueue {
    public static void main(String[] args) {

         Queue<Integer> qe=new LinkedList<>();
        qe.add(1);
        qe.add(2);
        qe.add(3);
        qe.add(4);
        qe.add(5);
        Queue<Integer> re=new LinkedList<>(); 
        while(qe.size()>0) {
         re.add(qe.remove());
        }
       while(re.size() >0) {
            System.out.print(re.peek()+" ");
            qe.add(re.remove());
        }
    }
}
