package leccod;

import java.util.ArrayList;

public class MST0206 {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (head != null){
            arrayList.add(head.val);
            head = head.next;
        }

        int l = 0,r = arrayList.size()-1;

        while (l<r){
            if (!arrayList.get(l).equals(arrayList.get(r))){
                return false;
            }
            l++;r--;
        }

        return true;
    }
}
