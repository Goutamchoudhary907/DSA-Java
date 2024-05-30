// return the node where cycle begin 
public class Cycle2 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode cycle2(ListNode head) {
     ListNode slow=head;
     ListNode fast=head;

     while(fast!=null) {
        slow=slow.next;
        fast=fast.next.next;
        if(fast==slow) break;
     }
     ListNode temp=head;
     while(temp!=slow) {
        temp=temp.next;
        slow=slow.next;
     }
     return slow;
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(100);
        ListNode b = new ListNode(5);
        ListNode c = new ListNode(7);
        ListNode d = new ListNode(10);
        ListNode e = new ListNode(1);
        ListNode f = new ListNode(15);
        ListNode g = new ListNode(8);
        ListNode h = new ListNode(17);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = d;
        
        ListNode temp=cycle2(a);
        System.out.println(temp.val);
    }
}
