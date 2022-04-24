package leccod;

import java.util.Arrays;
import java.util.Stack;

public class Offer06 {
    public static void main(String[] args) {

    }

    public int[] reversePrint(ListNode head) {
        if (head == null){
            return new int[]{};
        }
        Stack<ListNode> stack = new Stack<>();

        while(head != null){
            stack.push(head);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = stack.pop().val;
        }

        System.out.println(Arrays.toString(res));

        return res;
    }
}
