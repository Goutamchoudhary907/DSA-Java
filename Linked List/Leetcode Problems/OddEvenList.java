public class OddEvenList {

    public static class ListNode {
        ListNode next;
        int data;
        ListNode(int data) {
           this.data=data;
        }
       }


        public static ListNode oddEvenList(ListNode head) {
            if(head==null || head.next==null) return head;
            
            ListNode oddHead = null, oddTail = null;
            ListNode evenHead = null, evenTail = null;
            ListNode curr = head;
            int i = 1;
            while(curr!=null){
                // generate the odd indices list
                if(i%2==1){
                    if(oddHead==null){
                        oddHead = curr;
                        oddTail = curr;
                    }
                    else{
                        oddTail.next = curr;
                        oddTail = oddTail.next;
                    }
                }
                // generate the even indices list
                else{
                    if(evenHead==null){
                        evenHead = curr;
                        evenTail = curr;
                    }
                    else{
                        evenTail.next = curr;
                        evenTail = evenTail.next;
                    }
                }
                curr = curr.next;
                i++;
            }
            
            evenTail.next = null;     // there should not be any node after even tail
            oddTail.next  = evenHead;   // join even list after odd
            return oddHead;
        
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

     ListNode temp=oddEvenList(a);
     ListNode t=temp;
     while (t!=null) {
        System.out.print(t.data +" ");
        t=t.next;
     }
}    
}
