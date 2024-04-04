public class IntersectionOfTwoList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static int size(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int sizeA = size(headA);
        int sizeB = size(headB);
        if (sizeA > sizeB) {
            int steps = sizeA - sizeB;
            for (int i = 0; i < steps; i++) {
                tempA = tempA.next;
            }
        } else {
            int steps=sizeB-sizeA;
            for (int i = 0; i < steps; i++) {
                tempB = tempB.next;
            }
        }
        while(tempA!=tempB) {
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempA;
     }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(9);
        ListNode c = new ListNode(1);
        ListNode d = new ListNode(2);
        ListNode e = new ListNode(4);
        // ListNode f=new ListNode(15);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        // e.next=f;
        ListNode g = new ListNode(3);
        g.next = d;
        ListNode ans = getIntersectionNode(a, g);
        System.out.println(ans.val);
    }
}
