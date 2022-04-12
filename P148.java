package leccod;

import java.util.ArrayList;
import java.util.List;

public class P148 {
    public ListNode sortList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode temp = head;
        List<Integer> list = new ArrayList<>();
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        list.sort(null);
        ListNode res = new ListNode(list.get(0));
        if(list.size() > 1){
            res.next = new ListNode();
            temp = res.next;
        }


        for(int i = 1 ; i < list.size() ; i++){
            temp.val = list.get(i);
            if(i!= list.size()-1){
                temp.next = new ListNode();
                temp = temp.next;
            }
        }



        return res;
    }
}
