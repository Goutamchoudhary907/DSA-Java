public class MiddleElement {
    public static class ListNode {
     ListNode next;
     int data;
     ListNode(int data) {
        this.data=data;
     }
    }
    public static ListNode rightMiddle(ListNode head) {
      ListNode slow=head;
      ListNode fast=head;

      while(fast!=null && fast.next!=null) {
        slow=slow.next;
        fast=fast.next.next;        
      }
      return slow;
    }
    public static ListNode leftMiddle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
  
        while(fast!=null && fast.next.next!=null) {
          slow=slow.next;
          fast=fast.next.next;        
        }
        return slow;
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
         ListNode temp=rightMiddle(a);
         System.out.println(temp.data);

         ListNode temp2=leftMiddle(a);
         System.out.println(temp2.data);
    }
}
