public class DeleteMiddleNode {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static void display(ListNode head) {
        while(head !=null) {
            System.out.print(head.val+" ");
            head=head.next;
        }
     }
    public static ListNode deleteMiddle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        if(head.next ==null) {                   //single element list
            return null;          
        }
        while (fast.next.next!= null && fast.next.next.next!=null)  {
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    } 
    public static void main(String[] args) {
        ListNode a=new ListNode(100);
        ListNode b=new ListNode(5);
        ListNode c=new ListNode(7);
        ListNode d=new ListNode(10);
        ListNode e=new ListNode(1);
        ListNode f=new ListNode(15);
        ListNode g=new ListNode(8);
        ListNode h=new ListNode(17);

         a.next=b;
         b.next=c;
         c.next=d;
         d.next=e;
         e.next=f;
         f.next=g;
         g.next=h;

         ListNode temp=deleteMiddle(a);
         display(temp);
    }
}
