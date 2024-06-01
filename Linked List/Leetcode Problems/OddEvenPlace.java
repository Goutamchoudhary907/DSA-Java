//connect odd places list first then even place list 

public class OddEvenPlace {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    public static void print(ListNode head) {
        ListNode temp=head;
        while(temp!=null) {
            System.out.print(temp.val +" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static ListNode oddEvenPlace(ListNode head) {
     ListNode odd=new ListNode(0);
     ListNode tempo=odd;

     ListNode even=new ListNode(0);
     ListNode tempe=even;

     ListNode temp=head;
     while(temp!=null) {
        tempo.next=temp;
        temp=temp.next;
        tempo=tempo.next;
       

        if(temp==null) break;
        tempe.next=temp;
        temp=temp.next;
        tempe=tempe.next;
      
     }
     odd=odd.next;
     even=even.next;
     tempo.next=even;
     return odd;
    }

    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(10);
        ListNode c=new ListNode(13);
        ListNode d=new ListNode(4);
        ListNode e=new ListNode(5);
        ListNode f=new ListNode(6);
        ListNode g=new ListNode(7);
        ListNode h=new ListNode(2);

         a.next=b;
         b.next=c;
         c.next=d;
         d.next=e;
         e.next=f;
         f.next=g;
         g.next=h;
         ListNode temp=oddEvenPlace(a);
        //  ListNode t=temp;
        //  while(t!=null) {
        //     System.out.println(t.val);
        //     t=t.next;
        //  }
        print(temp);
}
}