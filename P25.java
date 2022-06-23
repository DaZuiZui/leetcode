package leccod;

import java.util.List;

public class P25 {
    public static void main(String[] args) {

    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode res = new ListNode(-1);
        ListNode restmp = res;
        ListNode headtmp = head;

        //start
        while(headtmp != null){
            //分组链表
            ListNode groupHead = new ListNode();
            ListNode groupHeadTmp = groupHead;
            //当前组中的个数
            int countOfGroup = 0;
            for (int i = 0;headtmp != null && i < k; i++) {
                groupHeadTmp.next = new ListNode(headtmp.val);
                groupHeadTmp = groupHeadTmp.next;
                //指针下移
                headtmp = headtmp.next;
                //组中元素+1
                countOfGroup++;
            }

            //反转的链表
            ListNode reverseList = new ListNode();
            //判断是否满足反转的需求
            if (countOfGroup == k){
                reverseList = reverse(groupHead.next);
            }else{
                reverseList = groupHead.next;
            }

            restmp.next = reverseList;
            //restmp指针移动到最后一个节点
            while(restmp.next != null){
                //System.out.println(restmp.val);
                restmp = restmp.next;
            }

            //System.out.println();
        }

        while(res != null){
            System.out.println(res.val);
            res = res.next;
        }



        return res;
    }

    public ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while (cur!= null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
