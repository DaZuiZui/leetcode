public class P876 {
    public class ListNode {
          int val;
          ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {

    }

    public ListNode middleNode(ListNode head) {
        ListNode p = head, q = head;
        while (p != null && q != null) {
            p = p.next.next;
            q = q.next;
        }
        return q;
    }
}
