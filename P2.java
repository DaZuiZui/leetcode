package leccod;

public class P2 {
    public static void main(String[] args) {

    }

    /*
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //创建头节点，尾节点
        ListNode head = null,foot = null;
        //创建和
        int sum = 0;
        //创建进位
        int carry = 0;

        while(true){
            int val1 = l1 !=null ? l1.val : 0;
            int val2 = l2 !=null ? l2.val : 0;
            sum = val1 + val2 +carry;
            //如果是第一次
            if(head == null){
                head = foot = new ListNode(sum % 10);
            }else{
                foot.next = new ListNode(sum % 10);
                foot = foot.next;
            }

            //计算是否进位
            carry = sum / 10;

            if(l1 != null){
                l1 = l1.next;
            }

            if(l2 != null){
                l2 = l2.next;
            }

            if(l1 == null && l2 == null){
                break;
            }
        }

        if(carry > 0){
            foot.next = new ListNode(carry);
        }

        return head;
    }*/
}
