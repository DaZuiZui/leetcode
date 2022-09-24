import java.util.LinkedList;

public class P707 {
    /**
     * ["get","addAtHead","addAtIndex","addAtHead"]
     * [[4],[4],[5,0],[6]]
     * @param args
     */
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(7);
        list.addAtHead(2);
        list.addAtHead(1);

        list.addAtIndex(3,0);
        System.out.println(list.list);
        list.deleteAtIndex(2);
        list.addAtHead(6);
        list.addAtTail(4);
        System.out.println(list.get(4));
        list.addAtHead(4);
        list.addAtIndex(5,0);
        list.addAtHead(6);
    }
}

class MyLinkedList {
    LinkedList<Integer> list = new LinkedList<>();

    public MyLinkedList() {

    }

    public int get(int index) {
        if (index >= list.size() || index < 0){
            return -1;
        }
        return list.get(index);
    }

    public void addAtHead(int val) {
        list.addFirst(val);
    }

    public void addAtTail(int val) {
        list.addLast(val);
    }

    public void addAtIndex(int index, int val) {
        //判断插入位置是否有效
        if (index < 0){
            list.addFirst(val);
            return;
        }
        if (index == list.size()){
            list.addLast(val);
            return;
        }else if (index > list.size()){
            return;
        }
        list.add(index,val);
    }

    public void deleteAtIndex(int index) {
        if (index >= list.size() || index < 0){
            return;
        }
        list.remove(index);
    }
}
