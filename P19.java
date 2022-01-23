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
class P19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode headtemp = head;
        //获取链表长度
        int length = 0;
        while(headtemp.next != null){
            headtemp = headtemp.next;
            length++;
        } 

  
        if(n > length+1 || length+1 == 1&& n==1){
            return null;
        }


         headtemp =head;
        
 
        for(int i = 0 ;i < length -n ; i++){
            headtemp = headtemp.next;
        }
         if(n == length+1){
            head = head.next;
         }else{
            headtemp.next = headtemp.next.next;
         }

         
 
        return head;
    }
}