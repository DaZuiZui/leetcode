package leccod;

import javafx.scene.effect.SepiaTone;

import java.util.HashSet;
import java.util.Set;

public class OfferII023 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set =new HashSet<>();
        ListNode temp = headA;
        while (temp != null){
            set.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while (temp != null){
            if (set.contains(temp)) return temp;
            temp = temp.next;
        }

        return null;
    }
}
