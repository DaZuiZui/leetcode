import java.util.List;

public class P147Agani {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }

    public static void main(String[] args) {

    }

    public ListNode insertionSortList(ListNode head) {
        ListNode tmp = new ListNode(0,head);
        ListNode pre = tmp;
        ListNode cur = head;
        while (cur != null){
            ListNode next = cur.next;
            if (next != null && next.val < cur.val){
                while (pre.next.val < next.val){
                    pre = pre.next;
                }

                cur.next = next.next;
                next.next = pre.next;
                pre.next = next;
                pre = tmp;
            }else{
                cur = cur.next;
            }
        }

        return pre.next;
    }
}
