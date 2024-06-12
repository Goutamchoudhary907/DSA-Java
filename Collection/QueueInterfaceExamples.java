import java.util.*;

public class QueueInterfaceExamples {
    public static void QueueEx(){
        LinkedList<Integer> q=new LinkedList<>();

        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q);
        
    }

    public static void PriorityQueueEx() {
      PriorityQueue<Integer> pq=new PriorityQueue<>();
// default priority is of smalles no ,gurantee is smalles no is at top other than no gurantee of order 
    
// PriorityQueue<Integer> hq=new PriorityQueue<>(Comparator.reverseOrder()); // higher no priority queue
     pq.add(10);       
      pq.add(5);
      pq.add(7);
      System.out.println(pq);            // 5 10 7
      System.out.println(pq.poll());     // remove 5
      System.out.println(pq);            // 7 10 
      System.out.println(pq.peek());     //7
            
    }


    public static void  DequeueExamples(){
     Deque<Integer> dq=new ArrayDeque <>() ;
     dq.addFirst(1);
     dq.addFirst(2);    // 2 1

     dq.addLast(3);     // 2 1 3   
     dq.addLast(4);       
     System.out.println(dq);

     System.out.println(dq.pollFirst());
     System.out.println(dq.pollLast());
    }
    public static void main(String[] args) {
    //    QueueEx();
    //    PriorityQueueEx();
       DequeueExamples();
    }
}
