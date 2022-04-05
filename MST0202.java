package leccod;

import java.util.List;

public class MST0202 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public int kthToLast(ListNode head, int k) {
        ListNode temp = head;
        ListNode now = head;
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }

        while (temp != null){
            temp = temp.next;
            now = now.next;
        }
        return now.val;
    }
}
