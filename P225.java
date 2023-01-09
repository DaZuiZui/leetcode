import java.util.ArrayDeque;
import java.util.Queue;

public class P225 {
    public static void main(String[] args) {
        MyStack p225 = new MyStack();
        p225.push(1);
        p225.push(2);
        p225.push(3);
        System.out.println(p225.top());
    }
}

class MyStack {
    Queue<Integer> a = new ArrayDeque<>();

    public MyStack() {

    }

    public void push(int x) {
        int n = a.size();
        a.offer(x);
        for (int i = 0; i < n; i++) {
            a.offer(a.poll());
        }
    }

    public int pop() {
        return a.poll();
    }

    public int top() {
        return a.peek();
    }

    public boolean empty() {
        return a.isEmpty();
    }
}
