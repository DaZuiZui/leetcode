package leccod;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

/*
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }

      
        ArrayList<Integer> arrlist = new ArrayList();
        while(head != null){
            arrlist.add(head.val);
            head = head.next;
        }

        //System.out.println(arrlist);
        ListNode list1 = new ListNode(0,new ListNode());
        ListNode list = list1;
        for(int i = arrlist.size() -1 ; i >= 0 ; i--){
            //System.out.println(i);
            list.next = new ListNode(arrlist.get(i));
            list = list.next;
        }

        return list1.next;
    }
}*/