package leccod;

import java.util.HashSet;
import java.util.Set;

public class Offer52 {
    public static void main(String[] args) {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();

        while (headA != null){
            set.add(headA);
            headA = headA.next;
        }

        while(headB != null){
            if (set.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}
