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
class P24 {
    /*
    public ListNode reverseKGroup(ListNode head, int k) {
        //如果链表长度为1或者链表为null那么就直接返回链表 
        if(head == null || head.next == null ||k <= 1){
            return head;
        }

        ListNode temp = head;
        List<Integer> list = new ArrayList();

        //获取链表中的数据
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }

        ListNode returnnode = new ListNode(0);
        ListNode l =returnnode;

        for(int i = k-1;i>=0;i--){
            System.out.println(list.get(i));
            l.next = new ListNode(list.get(i),null);
            l = l.next;
        }

        for(int i = k; i < list.size() ; i++){
            l.next = new ListNode(list.get(i),null);
            l = l.next;
        }


        return returnnode.next;
    }*/
}