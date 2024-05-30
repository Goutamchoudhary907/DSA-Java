public class SplitInEvenOdd {
    public static class ListNode {
        ListNode next;
        int data;
        ListNode(int data) {
           this.data=data;
        }
       }
public static void print(ListNode head) {
    ListNode temp=head;
    while(temp!=null) {
        System.out.print(temp.data +" ");
        temp=temp.next;
    }
    System.out.println();
}
       public static ListNode split(ListNode head) {
        ListNode oddDummy=new ListNode(-1);
        ListNode oddTail=oddDummy;

        ListNode evenDummy=new ListNode(0);
        ListNode evenTail=evenDummy;

        ListNode temp=head;
        while(temp!=null) {
            if(temp.data %2 !=0) {
                oddTail.next =new ListNode(temp.data);
               oddTail=oddTail.next;
             temp=temp.next;
            }
            else {
             evenTail.next=new ListNode(temp.data);
             evenTail=evenTail.next;
             temp=temp.next; 
            }
        }
        oddTail.next=evenDummy.next;
        return oddDummy.next;
       }
    
       public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(4);
        ListNode e=new ListNode(5);
        ListNode f=new ListNode(6);
        ListNode g=new ListNode(7);
        ListNode h=new ListNode(8);
    
         a.next=b;
         b.next=c;
         c.next=d;
         d.next=e;
         e.next=f;
         f.next=g;
         g.next=h;

       ListNode t=split(a);
       print(t);
}
}