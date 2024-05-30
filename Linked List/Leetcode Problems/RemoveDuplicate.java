public class RemoveDuplicate {
    
    public static class ListNode {
        ListNode next;
        int data;
        ListNode(int data) {
           this.data=data;
        }
       }

       public static ListNode duplicate(ListNode head) {
        ListNode temp=head;

      while(temp!=null && temp.next!=null) {
       if(temp.next.data==temp.data) {
        temp.next=temp.next.next;
       }
       if(temp.next.data!=temp.data) {
        temp=temp.next;
       }
      }
      return head;
       }

       public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(1);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(3);
        ListNode e=new ListNode(3);
        ListNode f=new ListNode(6);
        ListNode g=new ListNode(6);
        ListNode h=new ListNode(8);
    
         a.next=b;
         b.next=c;
         c.next=d;
         d.next=e;
         e.next=f;
         f.next=g;
         g.next=h;

         ListNode temp=duplicate(a);
         while (temp!=null) {
            System.out.print(temp.data +" ");
            temp=temp.next;
         }
       }
}
