package leccod;

public class Offer22 {
    public static void main(String[] args) {

    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode listNode = null;
        int n =0;
        for (ListNode node = head ;node!=null ; node = node.next) {
            n++;
        }

        for (listNode = head; n > k; n--) {
            listNode = listNode.next;
        }
        return listNode;
    }
}
