public class P1290 {
    public static void main(String[] args) {

    }
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }

    public int getDecimalValue(ListNode head) {
        StringBuilder stringBuilder = new StringBuilder();
        while (head != null){
            stringBuilder.append(head.val);
        }
        int i = Integer.parseInt(stringBuilder.toString(), 2);
        return i;
    }
}
