public class MergeTwoSortedList {
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
        System.out.println();
     }

    public static ListNode mergeTwoLists(ListNode list1 ,ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode head=new ListNode(100);
        ListNode temp=head;
        while (temp1 !=null && temp2 !=null) {
         if(temp1.val <temp2.val) {
            ListNode a=new ListNode(temp1.val);
            temp.next=a;
            temp=a;
            temp1=temp1.next;
         } else {
            ListNode a=new ListNode(temp2.val);
            temp.next=a;
            temp=a;
            temp2=temp2.next;
         }     
        }
        if(temp1==null) {
            temp.next=temp2;
        } else {
            temp.next=temp1;
        }
        return head.next;
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(5);
        ListNode d = new ListNode(7);
        ListNode e = new ListNode(10);
        ListNode p = new ListNode(11);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = p;

        ListNode f = new ListNode(2);
        ListNode g = new ListNode(4);
        ListNode h = new ListNode(6);
        ListNode i = new ListNode(8);
        ListNode j = new ListNode(9);
    
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;

        ListNode temp=mergeTwoLists(a,f);
        display(temp);
    }

}
