package leccod;

public class P237 {
    public static class ListNode {
        private int val;

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }

        private ListNode next;
        ListNode(int x) { val = x;}
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        head.next = new ListNode(4);
        ListNode temp  = head.next;
        temp.next = new ListNode(5);
        temp = temp.next;
        temp.next = new ListNode(1);
        temp = temp.next;
        temp.next = new ListNode(9);
        temp = temp.next;

        head = head.next;
        while(head != null){
            System.out.print(head.val+"->");
            head = head.next;
        }
    }

    public void deleteNode(ListNode node) {

    }
}
