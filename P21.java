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
class P21 {
    /*
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode listnode  = new ListNode(0);
        ListNode templist = listnode;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                templist.next = list1;
                templist = templist.next;
                list1 = list1.next;
            }else{
                templist.next = list2;
                templist = templist.next;
                list2 = list2.next;
            }
        }

        //其中一个为null
        if(list1 == null){
            templist.next = list2;
        }else{
            templist.next = list1;
        }

        return listnode.next;
    }*/
}