package leccod;

import lancup.A;

import java.util.ArrayList;

public class Offer25 {
    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null){
            return  null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        while(l1 != null){
            arrayList.add(l1.val);
            l1 = l1.next;
        }

        while (l2 != null){
            arrayList.add(l2.val);
            l2 = l2.next;
        }
        arrayList.sort(null);
        System.out.println(arrayList);
        ListNode listNode = new ListNode(10);
        ListNode temp  =  listNode;

        for (int i = 0 ; i < arrayList.size(); i++) {
            temp.val = arrayList.get(i);
            if(i == arrayList.size()-1){

            }else{
                temp.next = new ListNode(0);
                temp = temp.next;
            }
        }

        temp = null;

        return listNode;
    }
}
