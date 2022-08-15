import java.util.LinkedList;

public class P641 {
    public static void main(String[] args) {

    }
}


class MyCircularDeque {

    private int size = 0;
    private LinkedList<Integer> list = new LinkedList();

    //初始化大小
    public MyCircularDeque(int k) {
        this.size = k;
    }

    public boolean insertFront(int value) {
        //首先查看大小是否核算
        if (list.size() == size){
            return false;
        }
        list.addFirst(value);
        return true;
    }

    public boolean insertLast(int value) {
        //首先查看大小是否核算
        if (list.size() == size){
            return false;
        }
        list.addLast(value);
        return true;
    }

    public boolean deleteFront() {
        //判断大小是否为0，如果为0直接返回false
        if (list.size() == 0){
            return false;
        }

        list.removeFirst();
        return true;
    }

    public boolean deleteLast() {
        //判断大小是否为0，如果为0直接返回false
        if (list.size() == 0){
            return false;
        }

        list.removeLast();
        return true;
    }

    public int getFront() {
        //判断大小是否为0，如果为0直接返回-1
        if (list.size() == 0){
            return -1;
        }

       return  list.getFirst();
    }

    public int getRear() {
        if (list.size() == 0){
            return  -1;
        }

        return  list.getLast();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean isFull() {
        return list.size() == size;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */