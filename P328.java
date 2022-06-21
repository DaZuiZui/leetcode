package leccod;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

public class P328 {
    public static void main(String[] args) {

    }

    public ListNode oddEvenList(ListNode head) {
        ListNode res = new ListNode(-1);
        ListNode oddListNode = new ListNode(-1);
        ListNode oddListNodetmp = oddListNode;
        ListNode evenListNode = new ListNode(-1);
        ListNode evenListNodetmp = evenListNode;
        int indexOfListNode = 1;

        ListNode headtmp = head;
        while(headtmp != null){
            if (indexOfListNode % 2 == 1) {
                //System.out.println("奇数"+headtmp.val);
                oddListNodetmp.next = new ListNode(headtmp.val);
                oddListNodetmp=oddListNodetmp.next;
            }else{
                //System.out.println("偶数"+headtmp.val);
                evenListNodetmp.next =  new ListNode(headtmp.val);
                evenListNodetmp=evenListNodetmp.next;
            }
            indexOfListNode++;
            headtmp = headtmp.next;
        }
        //System.out.println(oddListNodetmp.val);
        oddListNodetmp.next = evenListNode.next;

        return oddListNode.next;
    }
}
