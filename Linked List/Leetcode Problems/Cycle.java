public class Cycle {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null) {
            if (slow == null)  return false;
            slow = slow.next;
            if (fast.next == null)  return false;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
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
        System.out.println(hasCycle(a));
    }
}