import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class P382 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {

    }

     Random random = new Random();
    List<Integer> list = new ArrayList<>();



    public P382(ListNode head) {
        while(head != null){

            list.add(head.val);
            head = head.next;
        }
    }

    public int getRandom() {
        if (list.size() ==0){
            return 0;
        }
        int i = random.nextInt(list.size()-1);
        return list.get(i);
    }
}
