package leccod;

class P23 {
    /*

    作者：hello-dazui
    链接：https://leetcode-cn.com/problems/merge-k-sorted-lists/solution/leetcode-p23-by-hello-dazui-nz25/
    来源：力扣（LeetCode）
    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

    public ListNode mergeKLists(ListNode[] lists) {
        //创建返回的ListNode
        ListNode returnHead = new ListNode(0);
        ListNode listemp = returnHead;

        List<Integer> list = new ArrayList();

        //遍历链表里的数据 
        for(int i = 0 ; i < lists.length ; i++){
            while(lists[i] != null){
                list.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
 
        Collections.sort(list);
        
        for(int i = 0 ; i < list.size() ; i++){
            listemp.next = new ListNode(list.get(i),null);
            listemp = listemp.next;
        }

        return returnHead.next;
    }

     */
}

